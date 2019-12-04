package com.weather.model;

public class Weather {



    private Temperature temperature;
    private Nebulosite nebulosite;
    private Pressure pressure;
    private Humidity humidity;
    private  Wind averageWind;
    private  Wind windBursts;
    private  Wind windDirection;
    private  float rain;
    private  float convectiveRain;
    private  Integer isoZero;
    private  String snowRisk;
    private  float mantle;


    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Nebulosite getNebulosite() {
        return nebulosite;
    }

    public void setNebulosite(Nebulosite nebulosite) {
        this.nebulosite = nebulosite;
    }

    public Pressure getPressure() {
        return pressure;
    }

    public void setPressure(Pressure pressure) {
        this.pressure = pressure;
    }

    public Humidity getHumidity() {
        return humidity;
    }

    public void setHumidity(Humidity humidity) {
        this.humidity = humidity;
    }

    public Wind getAverageWind() {
        return averageWind;
    }

    public void setAverageWind(Wind averageWind) {
        this.averageWind = averageWind;
    }

    public Wind getWindBursts() {
        return windBursts;
    }

    public void setWindBursts(Wind windBursts) {
        this.windBursts = windBursts;
    }

    public Wind getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Wind windDirection) {
        this.windDirection = windDirection;
    }

    public float getRain() {
        return rain;
    }

    public void setRain(float rain) {
        this.rain = rain;
    }

    public float getConvectiveRain() {
        return convectiveRain;
    }

    public void setConvectiveRain(float convectiveRain) {
        this.convectiveRain = convectiveRain;
    }

    public Integer getIsoZero() {
        return isoZero;
    }

    public void setIsoZero(Integer isoZero) {
        this.isoZero = isoZero;
    }

    public String getSnowRisk() {
        return snowRisk;
    }

    public void setSnowRisk(String snowRisk) {
        this.snowRisk = snowRisk;
    }

    public float getMantle() {
        return mantle;
    }

    public void setMantle(float mantle) {
        this.mantle = mantle;
    }

    @Override
    public String toString() {
        return "WeatherDTO{" +
                " temperature : " + temperature +
                " nebulosite : " + nebulosite +
                " pression : " + pressure +
                " humidite : " + humidity +
                " vent moyen : " + averageWind +
                " vent rafales : " + windBursts +
                " vent rafales : " + windDirection +
                " pluie : " + rain +
                " pluie_convective : " + convectiveRain +
                " iso zero : " + isoZero +
                " risque neige : " + snowRisk +
                " cape : " + mantle +
                '}';
    }
}
