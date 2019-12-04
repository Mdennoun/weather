package com.weather.dto;

import com.google.gson.annotations.SerializedName;

public class HumidityDTO {
    @SerializedName("2m") private float _2m;

    public float get_2m() {
        return _2m;
    }

    public void set_2m(float _2m) {
        this._2m = _2m;
    }

    @Override
    public String toString() {
        return "HumidityDTO{" +
                "_2m=" + _2m +
                '}';
    }
}
