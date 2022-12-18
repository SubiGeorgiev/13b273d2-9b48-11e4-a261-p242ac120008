package com.proect.covid.repositories;

import com.proect.covid.models.Country;
import com.proect.covid.repositories.contracts.CountriesRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.query.Query;
import javax.persistence.EntityNotFoundException;
import java.time.Instant;

@Repository
public class CountriesRepositoryImpl implements CountriesRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public CountriesRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveDayByCountry(Country country) {
        try(Session session = sessionFactory.openSession()){
            session.save(country);
        }
    }

    @Override
    public Country getDayByCountry(String code, Instant day) {

        try(Session session = sessionFactory.openSession()){
            Query<Country> query = session.createQuery(
                    "from Country where countryCode =: countryCode"
                    , Country.class);
            query.setParameter("countryCode",code);

            if(query.list().size()==0){
                throw new EntityNotFoundException("No entries found");
            }
            return (Country) query.list().get(0);
        }
    }
}
