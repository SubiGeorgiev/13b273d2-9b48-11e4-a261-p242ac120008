package com.proect.covid.repositories.contracts;

import com.proect.covid.models.Country;

import java.time.Instant;

public interface CountriesRepository {

    public void saveDayByCountry(Country country);
    public Country getDayByCountry(String code, Instant day);
}
