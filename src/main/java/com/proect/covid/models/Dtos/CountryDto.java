package com.proect.covid.models.Dtos;

import java.time.Instant;
import java.time.LocalDateTime;

public class CountryDto {

    private String ID;
    private String Country;
    private String CountryCode;
    private String Slug;

    private int newConfirmed;

    private int totalConfirmed;

    private int newDead;

    private int totalDead;

    private int newRecovered;

    private int totalRecovered;

    private Instant Date;

}
