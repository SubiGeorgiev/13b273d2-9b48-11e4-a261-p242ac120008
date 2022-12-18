package com.proect.covid.services.contracts;

import com.proect.covid.models.Country;

public interface CountriesService {

    public void saveDayByCountry();
    public Country getDayByCountry(String code);
}
