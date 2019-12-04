package com.weather.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.accessibilityservice.AccessibilityService;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.weather.R;
import com.weather.adapter.WeatherAdapter;
import com.weather.dto.LocationModelDTO;
import com.weather.dto.WeatherDTO;
import com.weather.model.LocationModel;
import com.weather.model.Weather;
import com.weather.sevices.NetworkProvider;

import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.ResponseBody;

public class MainActivity extends AppCompatActivity {
    RecyclerView weatherRV;
    private WeatherAdapter weatherAdapter;
    String weatherPath = "" ;
    List<WeatherDTO> weatherList= new ArrayList<>();
    WeatherActivityListener weatherListener;

    public interface WeatherActivityListener {
        void onWeatherSent(Weather weather);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weatherRV = this.findViewById(R.id.recycle_view_weather);
        NetworkProvider.getInstance().getWeather(new NetworkProvider.Listner<LocationModelDTO>() {
            @Override public void onSuccess(LocationModelDTO data) {

                Log.d("test", data.toString());

            }

            @Override public void onError(Throwable t) {
                Log.e("getWeatherMAIN","Error on getWeather : " + t.toString());

            }
        });

        //loadData();
        //initRecyclerView();
    }
    private void initRecyclerView() {

        weatherRV.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        weatherAdapter = new WeatherAdapter();
        weatherRV.setAdapter(weatherAdapter);

        weatherAdapter.setItemClickListener(waste -> {

            Log.d("test","click");



        });
    }
    /*
        private void loadData() {
            NetworkProvider.getInstance().getWeather(new NetworkProvider.Listner<List<Weather>>() {
            @Override public void onSuccess(List<Weather> data) {
                weatherAdapter.setWeatherList(data);
            }

            @Override public void onError(Throwable t) {
                Log.e("getWeatherMAIN","Error on getWeather : " + t.toString());

            }
        });

        }

        private void initRecyclerView() {
            weatherRV.setLayoutManager(new LinearLayoutManager(this));
            weatherAdapter = new WeatherAdapter();
            weatherRV.setAdapter(weatherAdapter);

            weatherAdapter.setItemClickListener(weather -> {

                weatherListener.onWeatherSent(weather);
                // Add navigation here "Intent"

            });
        }
    */
    private void loadData() {
        List<Weather> list = new ArrayList<>();
       weatherAdapter.setWeatherList(list);

    }



}
