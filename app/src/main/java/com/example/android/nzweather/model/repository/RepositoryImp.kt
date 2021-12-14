package com.example.android.nzweather.model.repository

import com.example.android.nzweather.model.entities.Weather

class RepositoryImp : Repository {

    override fun getWeatherFromServer() = Weather()

    override fun getWeatherFromLocalStorage() = Weather()
}