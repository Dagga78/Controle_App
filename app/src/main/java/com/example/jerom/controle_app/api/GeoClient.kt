package com.example.jerom.controle_app.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    fun getEarthQuake(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/4.5_day.geojson")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}