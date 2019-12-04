package com.weather.model;

public class Wind {

    private float _10m;

    public float get_10m() {
        return _10m;
    }

    public void set_10m(float _10m) {
        this._10m = _10m;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "_10m=" + _10m +
                '}';
    }
}