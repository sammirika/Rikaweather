package com.example.sammirika.rikaweather.gson;

import java.util.List;

/**
 * Created by Sammirika on 2017/4/24.
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    public List<Forecast> forecastList;
}
