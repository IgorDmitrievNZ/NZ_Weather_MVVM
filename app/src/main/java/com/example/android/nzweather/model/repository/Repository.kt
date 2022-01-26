package com.example.android.nzweather.model.repository

import com.example.android.nzweather.model.entities.Weather

interface Repository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorageNorthIsland(): List<Weather>
    fun getWeatherFromLocalStorageSouthIsland(): List<Weather>
}