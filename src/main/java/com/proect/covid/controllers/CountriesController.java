package com.proect.covid.controllers;

import com.proect.covid.models.Country;
import com.proect.covid.services.CountriesServiceImpl;
import com.proect.covid.services.contracts.ApisServices;
import org.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.MissingResourceException;

@RestController
@RequestMapping("/api")
public class CountriesController {

    public static final String COULDN_T_LOAD_DATA_FROM_API = "Couldn't load data from API";
    private final CountriesServiceImpl countriesService;

    public CountriesController(CountriesServiceImpl patients) {
        this.countriesService = patients;
    }

    @GetMapping("/country/{countryCode:[A-Z]{2}}")
    public Country getByCountry(@PathVariable String countryCode) {

        try {
            countriesService.saveDayByCountry();
        } catch (JSONException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, COULDN_T_LOAD_DATA_FROM_API);
        }

        return countriesService.getDayByCountry(countryCode);
    }
}
