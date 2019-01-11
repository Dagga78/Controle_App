package com.example.jerom.controle_app.api


import com.example.jerom.controle_app.models.EarthQuake
import retrofit2.Call
import retrofit2.http.GET

interface EarthQuakeInterface {
    @GET("/earthquakes/feed/v1.0/summary/4.5_day.geojson")
    fun getEarthQuake(): Call<EarthQuake>
}