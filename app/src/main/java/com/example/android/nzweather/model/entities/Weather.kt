package com.example.android.nzweather.model.entities

data class Weather(
    var city: City = getDefaultCity(),
    val temperature: Int = 0,
    val feelsLike: Int = 0
)

fun getDefaultCity() = City("Auckland", -36.848461, 174.763336)
