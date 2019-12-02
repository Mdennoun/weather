package com.weather.sevices;

import com.weather.dto.WeatherDTO;
import com.weather.model.Weather;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WeatherServices {

    @GET("gfs/json?_ll=48.85341,2.3488&_auth=UUtRRgR6ASNfclRjDnhReFc%2FADUBdwYhUy8HZFg9An8BagNiDm5UMgRqBnsCLVFnAC0BYg41CDhTOAd%2FWCpWN1E7UT0EbwFmXzBUMQ4hUXpXYQBjAT8GPFMwB39YKgJgAWsDZQ5zVDIEbwZ6AjRRZgAtAWAONwgxUy8Hf1g0VjBRNVEwBGUBal82VDQOO1FhV3sAfwE7BmpTZQdlWDQCMgE0AzIOP1Q2BG4GMgI7UWUALQFhDjkIM1M5B2VYM1Y0UTdRKgR4ARpfQ1QrDn5RJ1cxACYBIwZrU24HNA%3D%3D&_c=b210041510b0f319f86b9371ccbc147e")
    Call<WeatherDTO> getWeather();
}
