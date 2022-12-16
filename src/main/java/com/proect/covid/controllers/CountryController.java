package com.proect.covid.controllers;

import com.proect.covid.services.contracts.ApisServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CountryController {

    private final ApisServices apisServices;

    public CountryController(ApisServices apisServices) {
        this.apisServices = apisServices;
    }

    @GetMapping("/country/{countryCode:[A-Z]{2}}")
    public String getByCountry(@PathVariable String countryCode){

        String str = apisServices.getJason();

        return countryCode;
    }
}
