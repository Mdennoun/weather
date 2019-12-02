package com.weather.dto;

import com.google.gson.annotations.SerializedName;

public class TemperatureDTO {
    @SerializedName("2m") private float m2;
    @SerializedName("sol") private float sol;
    @SerializedName("500hPa") private float hPa500;
    @SerializedName("850hPa") private float hPa850;


    // Getter Methods

    public float get2m() {
        return m2;
    }

    public float getSol() {
        return sol;
    }

    public float get500hPa() {
        return hPa500;
    }

    public float get850hPa() {
        return hPa850;
    }

    // Setter Methods

    public void set2m(float m2) {
        this .m2 = m2;
    }

    public void setSol(float sol) {
        this.sol = sol;
    }

    public void set500hPa(float hPa500) {
        this.hPa500 = hPa500;
    }

    public void set850hPa(float hPa850) {
        this.hPa850 = hPa850;
    }

    @Override
    public String toString() {
        return "TemperatureDTO{" +
                "m2=" + m2 +
                ", sol=" + sol +
                ", hPa500=" + hPa500 +
                ", hPa850=" + hPa850 +
                '}';
    }
}