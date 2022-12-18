package com.proect.covid.services;

import com.proect.covid.models.Country;
import com.proect.covid.repositories.contracts.CountriesRepository;
import com.proect.covid.services.contracts.ApisServices;
import com.proect.covid.services.contracts.CountriesService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.Instant;

@Service
public class CountriesServiceImpl implements CountriesService {

    private ApisServices apisServices;
    private CountriesRepository countriesRepository;

    @Autowired
    public CountriesServiceImpl(ApisServices apisServices, CountriesRepository countriesRepository) {
        this.apisServices = apisServices;
        this.countriesRepository = countriesRepository;
    }

    @Override
    public Country getDayByCountry(String code) {

        Instant today = Instant.now();
        countriesRepository.getDayByCountry(code, today);
        return countriesRepository.getDayByCountry(code, today);
    }

    @Override
    public void saveDayByCountry() throws JSONException {

        String json = apisServices.getJson();
        JSONObject obj = new JSONObject(json);

        JSONArray album = obj.getJSONArray("Countries");

        Country newCountry = new Country();

        for (int i = 0; i < album.length(); i++) {

            JSONObject obj2 = album.getJSONObject(i);
            newCountry = loadData(album.getJSONObject(i));
            countriesRepository.saveDayByCountry(newCountry);
        }
    }

    private static Country loadData(JSONObject obj) {

        Country country = new Country();

        country.setKeyId(obj.getString("ID"));
        country.setCountry(obj.getString("Country"));
        country.setCountryCode(obj.getString("CountryCode"));
        country.setSlug(obj.getString("Slug"));
        country.setNewConfirmed(obj.getInt("NewConfirmed"));
        country.setTotalConfirmed(obj.getInt("TotalConfirmed"));
        country.setNewDeaths(obj.getInt("NewDeaths"));
        country.setTotalDeaths(obj.getInt("TotalDeaths"));
        country.setNewRecovered(obj.getInt("NewRecovered"));
        country.setTotalRecovered(obj.getInt("TotalRecovered"));

        Instant dateTime = Instant.parse(obj.getString("Date"));
        country.setDateTime(dateTime);

        return country;
    }
}
