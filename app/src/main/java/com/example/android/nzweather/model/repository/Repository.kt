package com.example.android.nzweather.model.repository

import com.example.android.nzweather.model.entities.Weather

interface Repository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorage(): Weather
}