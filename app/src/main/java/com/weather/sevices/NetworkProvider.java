package com.weather.sevices;

import android.os.Build;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.weather.dto.LocationModelDTO;
import com.weather.dto.WeatherDTO;
import com.weather.mapper.WeatherMapper;
import com.weather.model.LocationModel;
import com.weather.model.Weather;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
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


        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @NotNull
                    @Override
                    public okhttp3.Response intercept(@NotNull Chain chain) throws IOException {
                        Request original = chain.request();
                        String credentials = "Mohamed.dennoun" + ":" + "Pacifica2020";
                        String base64EncodedCredentials = android.util.Base64.encodeToString(credentials.getBytes(), android.util.Base64.NO_WRAP);
                        Log.d("credential", base64EncodedCredentials);
                        // Request customization: add request headers
                        Request.Builder requestBuilder = original.newBuilder()
                                .header("Proxy-Authorization", base64EncodedCredentials); // <-- this is the important line

                        Request request = requestBuilder.build();
                        return chain.proceed(request);
                    }
                })
                .build();





        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.infoclimat.fr/")
                //.client(okHttpClient)
                //On appel GsonConverterFactory qui a été implementer dans le gradle dependencies  avant et qui recuperere un type et un objet pour renvoyer un objet
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        weatherServices = retrofit.create(WeatherServices.class);
    }


    public void getWeather (Listner<LocationModel> listner) {

        weatherServices.getWeather().enqueue(new Callback<LocationModelDTO>() {

            @Override
            public void onResponse(Call<LocationModelDTO> call, Response<LocationModelDTO> response) {

                Gson gson = new GsonBuilder()
                        .excludeFieldsWithoutExposeAnnotation()
                        .create();


                Log.d("getWeatherNPA", " on getWeather : " + call.request().toString());

                    Log.d("getWeatherNPA", " on getWeather : " + response.body().toString());



                /*List<WeatherDTO> weatherDTOList = response.body();
                List<Weather> weatherList = WeatherMapper.map(weatherDTOList);

                listner.onSuccess(weatherList);
                */

            }

            @Override
            public void onFailure(Call<LocationModelDTO> call, Throwable t) {

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
