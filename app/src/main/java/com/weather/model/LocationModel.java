package com.weather.model;

public class LocationModel {
    private int request_state;
    private transient String request_key;
    private String message;
    private int model_run;
    private String source;
    private Weather   weather;

    public int getRequest_state() {
        return request_state;
    }

    public void setRequest_state(int request_state) {
        this.request_state = request_state;
    }

    public String getRequest_key() {
        return request_key;
    }

    public void setRequest_key(String request_key) {
        this.request_key = request_key;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getModel_run() {
        return model_run;
    }

    public void setModel_run(int model_run) {
        this.model_run = model_run;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather  weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "LocationModel{" +
                "request_state=" + request_state +
                ", request_key='" + request_key + '\'' +
                ", message='" + message + '\'' +
                ", model_run=" + model_run +
                ", source='" + source + '\'' +
                ", weather=" + weather +
                '}';
    }
}
