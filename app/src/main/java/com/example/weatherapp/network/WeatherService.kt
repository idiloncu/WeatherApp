package com.example.weatherapp.network

import com.example.weatherapp.models.WeatherResponse
import retrofit.Call
import retrofit.http.GET
import retrofit.http.Query

interface WeatherService {
    @GET("3.0/onecall")
    fun getWeather(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("units") units: String?,
        @Query("appid") appid: String?
    ): Call<WeatherResponse>
}