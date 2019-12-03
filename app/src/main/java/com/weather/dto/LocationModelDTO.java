package com.weather.dto;

import com.bumptech.glide.annotation.Excludes;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.weather.model.Weather;

import java.util.Arrays;

public class LocationModelDTO {
    @Expose(serialize = true) private Weather [] weathers;



    public Weather [] getWeathers() {
        return weathers;
    }

    public void setWeathers(Weather[] weathers) {
        this.weathers = weathers;
    }

    @Override
    public String toString() {
        return "LocationModel{" +
                ", weathers=" + weathers +
                '}';
    }
}
