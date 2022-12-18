package com.proect.covid.controllers;

import com.proect.covid.services.CountriesServiceImpl;
import com.proect.covid.services.contracts.ApisServices;
import org.json.JSONException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CountriesController {

    public static final String COULDN_T_LOAD_DATA_FROM_API = "Couldn't load data from API";
    private final CountriesServiceImpl countriesService;

    public CountriesController(CountriesServiceImpl patients) {
        this.countriesService = patients;
    }

    @GetMapping("/country/{countryCode:[A-Z]{2}}")
    public String getByCountry(@PathVariable String countryCode){

        try {
            countriesService.saveDailyDataByCountry();
        } catch (JSONException e){
            return COULDN_T_LOAD_DATA_FROM_API;
        }

        return countryCode;
    }
}
