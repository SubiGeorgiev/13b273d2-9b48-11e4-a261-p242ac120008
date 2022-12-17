package com.proect.covid.services;

import com.proect.covid.services.contracts.ApisServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServicesImpl implements ApisServices {

    private static final String URL = "https://api.covid19api.com/summary";

    @Autowired
    public ApiServicesImpl() {
    }


    @Override
    public String getJson() throws RestClientException {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(
                URL, HttpMethod.GET, null, String.class);

        return response.getBody();
    }
}
