package com.weather.dto;

import com.google.gson.annotations.SerializedName;

public class WindDTO {

    @SerializedName("10m") private float _10m;

    public float get_10m() {
        return _10m;
    }

    public void set_10m(float _10m) {
        this._10m = _10m;
    }

    @Override
    public String toString() {
        return "WindDTO{" +
                "_10m=" + _10m +
                '}';
    }
}