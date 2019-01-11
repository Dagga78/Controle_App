package com.example.jerom.controle_app.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    fun getEarthQuake(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://earthquake.usgs.gov")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}