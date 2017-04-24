package com.example.sammirika.rikaweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sammirika on 2017/4/24.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public  String weatherId;

    public  Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
