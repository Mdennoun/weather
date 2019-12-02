package com.weather.sevices;

import android.util.Log;

import com.weather.dto.WeatherDTO;
import com.weather.mapper.WeatherMapper;
import com.weather.model.Weather;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkProvider {

    WeatherServices weatherServices;

    //Singleton pas tres bien car tout le monde peut y acceder
    private static NetworkProvider instance;

    public static NetworkProvider getInstance() {
        if (instance == null) {
            instance = new NetworkProvider();
        }
        return instance;
    }

    public NetworkProvider() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.infoclimat.fr/public-api/")
                //On appel GsonConverterFactory qui a été implementer dans le gradle dependencies  avant et qui recuperere un type et un objet pour renvoyer un objet
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        weatherServices = retrofit.create(WeatherServices.class);
    }


    public void getWeather (Listner<Weather> listner) {

        weatherServices.getWeather().enqueue(new Callback<WeatherDTO>() {

            @Override
            public void onResponse(Call<WeatherDTO> call, Response<WeatherDTO> response) {

                Log.d("getWeatherNPA", " on getWeather : " + call.request().toString());

                Log.d("getWeatherNP", " on getWeather : " + response.body().toString());

                WeatherDTO weatherDTOList = response.body();
                Weather weatherList = WeatherMapper.map(weatherDTOList);

                listner.onSuccess(weatherList);
            }

            @Override
            public void onFailure(Call<WeatherDTO> call, Throwable t) {

                Log.e("getWeatherNPA", "Error on getWeather : " + call.request().toString());
                listner.onError(t);
                Log.e("getWeatherNP", "Error on getWeather : " + t.toString());
            }
        });

    }
    public interface Listner<T> {
        void onSuccess(T data);
        void onError(Throwable t);
    }

}
