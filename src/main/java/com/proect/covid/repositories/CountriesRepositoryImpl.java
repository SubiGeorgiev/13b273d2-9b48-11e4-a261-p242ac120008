package com.proect.covid.repositories;

import com.proect.covid.models.Country;
import com.proect.covid.repositories.contracts.CountriesRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    public List<Country> getByCountry(Country country) {
        return null;
    }

    @Override
    public List<Country> getByDate() {
        //TODO
        return null;
    }
}
