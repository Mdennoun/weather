package com.weather.dto;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LocationModelDTO {

    @SerializedName("request_state") private Integer request_state;
    @SerializedName("request_key") private transient String request_key;
    @SerializedName("message") private transient String message;
    @SerializedName("model_run")  private transient Integer model_run;
    @SerializedName("source")
    @Expose private transient String source;
    @SerializedName("2019-12-06 19:00:00") private WeatherDTO weather;




    public Integer getRequest_state() {
        return request_state;
    }

    public void setRequest_state(Integer request_state) {
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

    public Integer getModel_run() {
        return model_run;
    }

    public void setModel_run(Integer model_run) {
        this.model_run = model_run;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public WeatherDTO  getWeather() {
        return weather;
    }

    public void setWeather(WeatherDTO weather) {
        this.weather = weather;
    }

    @Override
    public String  toString() {
        return "LocationModelDTO{" +
                "request_state=" + request_state +
                ", request_key='" + request_key + '\'' +
                ", message='" + message + '\'' +
                ", model_run=" + model_run +
                ", source='" + source + '\'' +
                ", weather=" + weather +
                '}';
    }
}
