package com.weather.dto;

import com.google.gson.annotations.SerializedName;

public class WeatherDTO {

    @SerializedName("temperature") private  TemperatureDTO temperatureDTO;
    @SerializedName("nebulosite") private  NebulositeDTO nebulositeDTO;
    @SerializedName("pression") private  PressureDTO pressureDTO;
    @SerializedName("humidite") private  HumidityDTO humidityDTO;
    @SerializedName("vent_moyen") private  WindDTO averageWindDTO;
    @SerializedName("vent_rafales") private  WindDTO windBurstsDTO;
    @SerializedName("vent_direction") private  WindDTO windDirectionDTO;
    @SerializedName("pluie") private  float rainDTO;
    @SerializedName("pluie_convective") private  float convectiveRainDTO;
    @SerializedName("iso_zero") private  Integer isoZeroDTO;
    @SerializedName("risque_neige") private  String snowRiskDTO;
    @SerializedName("cape") private  float mantleDTO;



    public TemperatureDTO getTemperatureDTO() {
        return temperatureDTO;
    }

    public void setTemperatureDTO(TemperatureDTO temperatureDTO) {
        this.temperatureDTO = temperatureDTO;
    }

    public NebulositeDTO getNebulositeDTO() {
        return nebulositeDTO;
    }

    public void setNebulositeDTO(NebulositeDTO nebulositeDTO) {
        this.nebulositeDTO = nebulositeDTO;
    }

    public PressureDTO getPressureDTO() {
        return pressureDTO;
    }

    public void setPressureDTO(PressureDTO pressureDTO) {
        this.pressureDTO = pressureDTO;
    }

    public HumidityDTO getHumidityDTO() {
        return humidityDTO;
    }

    public void setHumidityDTO(HumidityDTO humidityDTO) {
        this.humidityDTO = humidityDTO;
    }

    public WindDTO getAverageWindDTO() {
        return averageWindDTO;
    }

    public void setAverageWindDTO(WindDTO averageWindDTO) {
        this.averageWindDTO = averageWindDTO;
    }

    public WindDTO getWindBurstsDTO() {
        return windBurstsDTO;
    }

    public void setWindBurstsDTO(WindDTO windBurstsDTO) {
        this.windBurstsDTO = windBurstsDTO;
    }

    public WindDTO getWindDirectionDTO() {
        return windDirectionDTO;
    }

    public void setWindDirectionDTO(WindDTO windDirectionDTO) {
        this.windDirectionDTO = windDirectionDTO;
    }

    public float getRainDTO() {
        return rainDTO;
    }

    public void setRainDTO(float rainDTO) {
        this.rainDTO = rainDTO;
    }

    public float getConvectiveRainDTO() {
        return convectiveRainDTO;
    }

    public void setConvectiveRainDTO(float convectiveRainDTO) {
        this.convectiveRainDTO = convectiveRainDTO;
    }

    public Integer getIsoZeroDTO() {
        return isoZeroDTO;
    }

    public void setIsoZeroDTO(Integer isoZeroDTO) {
        this.isoZeroDTO = isoZeroDTO;
    }

    public String getSnowRiskDTO() {
        return snowRiskDTO;
    }

    public void setSnowRiskDTO(String snowRiskDTO) {
        this.snowRiskDTO = snowRiskDTO;
    }

    public float getMantleDTO() {
        return mantleDTO;
    }

    public void setMantleDTO(float mantleDTO) {
        this.mantleDTO = mantleDTO;
    }

    @Override
    public String toString() {
        return "WeatherDTO{" +
                " temperature : " + temperatureDTO +
                " nebulosite : " + nebulositeDTO +
                " pression : " + pressureDTO +
                " humidite : " + humidityDTO +
                " vent moyen : " + averageWindDTO +
                " vent rafales : " + windBurstsDTO +
                " vent direction : " + windDirectionDTO +
                " pluie : " + rainDTO +
                " pluie_convective : " + convectiveRainDTO +
                " iso zero : " + isoZeroDTO +
                " risque neige : " + snowRiskDTO +
                " cape : " + mantleDTO +
                '}';
    }
}

