package com.example.android.nzweather.model.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Weather(
    var city: City = getDefaultCity(),
    val temperature: Int = 0,
    val feelsLike: Int = 0
) : Parcelable

fun getDefaultCity() = City("Auckland", -36.848461, 174.763336)

fun getSouthCities() = listOf(
    Weather(City("Nelson", -36.848461, 174.763336)),
    Weather(City("Blenheim", -36.848461, 174.763336)),
    Weather(City("Picton", -36.848461, 174.763336)),
    Weather(City("Westport", -36.848461, 174.763336)),
    Weather(City("Christchurch", -36.848461, 174.763336)),
    Weather(City("Queenstown", -36.848461, 174.763336)),
    Weather(City("Invercargill", -36.848461, 174.763336)),
    Weather(City("Dunedin", -36.848461, 174.763336)),
)

fun getNorthCities() = listOf(
    Weather(City("Auckland", -36.848461, 174.763336)),
    Weather(City("Wellington", -36.848461, 174.763336)),
    Weather(City("Whangarei", -36.848461, 174.763336)),
    Weather(City("Tauranga", -36.848461, 174.763336)),
    Weather(City("Hamilton", -36.848461, 174.763336)),
    Weather(City("Taupo", -36.848461, 174.763336)),
    Weather(City("Rotorua", -36.848461, 174.763336)),
    Weather(City("Gisborne", -36.848461, 174.763336)),
    Weather(City("Napier", -36.848461, 174.763336)),
    Weather(City("Palmerston North", -36.848461, 174.763336)),
    Weather(City("Masterton", -36.848461, 174.763336)),
    Weather(City("Lower Hutt", -36.848461, 174.763336)),
    Weather(City("New Plymouth", -36.848461, 174.763336))
)