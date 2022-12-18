package com.proect.covid.repositories.contracts;

import com.proect.covid.models.Country;

import java.util.List;

public interface CountriesRepository {

    public void saveDayByCountry(Country country);
    public List<Country> getByCountry(Country country);
    public List<Country> getByDate();
}
