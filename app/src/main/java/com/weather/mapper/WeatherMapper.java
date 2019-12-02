package com.weather.mapper;

import com.weather.dto.WeatherDTO;
import com.weather.model.Weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherMapper {
    public static List<Weather> map (List<WeatherDTO> weatherDTOList) {
        List<Weather> weatherList = new ArrayList<>();
        for(WeatherDTO weatherDTO : weatherDTOList) {
            weatherList.add(map(weatherDTO));
        }
        return weatherList;
    }

    public static Weather map(WeatherDTO weatherDTO) {
        Weather weather = new Weather();

        return weather;
    }
}
