package com.weather.sevices;

import com.bumptech.glide.annotation.Excludes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import com.weather.dto.LocationModelDTO;
import com.weather.dto.WeatherDTO;
import com.weather.model.Weather;

import org.json.JSONObject;

import java.util.List;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface WeatherServices {

    @GET("public-api/gfs/json?_ll=48.85341,2.3488&_auth=VU8EE1IsBCZUeVFmBHIGLwVtVWAOeAYhAn4HZAtuVShROgBhUjJcOgdpUy5QfwcxBSgPbFxnADBTOFYuXy1TMlU%2FBGhSOQRjVDtRNAQrBi0FK1U0Di4GIQJnB2ILeFU0UTEAelI5XDoHdlMwUGEHNwUpD3BcYgA9UzZWNV82UzhVNwRkUjEEYVQkUSwEMQZmBTJVNQ4wBjkCZgc2C2ZVMFFnADVSOFw7B3ZTOFBhBzQFMg9vXGYAO1MwVi5fLVNJVUUEfVJxBCRUblF1BCkGZwVoVWE%3D&_c=88bf0afd6ef9730869e30eced820d420")
    Call<LocationModelDTO> getWeather();
}
