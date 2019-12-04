package com.weather.model;

public class Humidity {
    private float _2m;

    public float get_2m() {
        return _2m;
    }

    public void set_2m(float _2m) {
        this._2m = _2m;
    }

    @Override
    public String toString() {
        return "Humidity{" +
                "_2m=" + _2m +
                '}';
    }
}
