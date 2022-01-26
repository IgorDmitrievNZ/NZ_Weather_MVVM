package com.example.android.nzweather.model.repository

import com.example.android.nzweather.model.entities.Weather
import com.example.android.nzweather.model.entities.getNorthCities
import com.example.android.nzweather.model.entities.getSouthCities

class RepositoryImp : Repository {

    override fun getWeatherFromServer() = Weather()

    override fun getWeatherFromLocalStorageNorthIsland() = getNorthCities()

    override fun getWeatherFromLocalStorageSouthIsland() = getSouthCities()
}