package com.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class TemperatureDTO {
    @SerializedName("2m") private Float _2m;
    @SerializedName("sol") private Float sol;
    @SerializedName("500hPa") private Float _500hPa;
    @SerializedName("850hpA") private Float _850hPa;

    public Float get2m() {
        return _2m;
    }

    public void set2m(Float _2m) {
        this._2m = _2m;
    }

    public Float getSol() {
        return sol;
    }

    public void Float(Float sol) {
        this.sol = sol;
    }

    public Float get500hPa() {
        return _500hPa;
    }

    public void set500hPa(Float _500hPa) {
        this._500hPa = _500hPa;
    }

    public Float get850hPa() {
        return _850hPa;
    }

    public void set850hPa(Float _850hPa) {
        this._850hPa = _850hPa;
    }



    @Override
    public String toString() {
        return "TemperatureDTO{" +
                "_2m=" + _2m +
                ", sol=" + sol +
                ", _500hPa=" + _500hPa +
                ", _850hPa=" + _850hPa +
                '}';
    }
}