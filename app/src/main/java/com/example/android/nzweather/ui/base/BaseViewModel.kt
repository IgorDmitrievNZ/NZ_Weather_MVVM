package com.example.android.nzweather.ui.base

import android.util.Log
import androidx.lifecycle.*
import com.example.android.nzweather.AppState
import com.example.android.nzweather.model.repository.Repository
import java.lang.Thread.sleep

class BaseViewModel(private val repository: Repository) : ViewModel(), LifecycleObserver {
    private val liveData: MutableLiveData<AppState> = MutableLiveData()

    fun getLiveData(): LiveData<AppState> = liveData

    fun getWeather() = getDataFromLocalSource()

    private fun getDataFromLocalSource() {
        liveData.value = AppState.Loading
        Thread {
            sleep(2000)
            liveData.postValue(AppState.Success(repository.getWeatherFromLocalStorage()))
        }.start()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private fun onViewStart() {
        Log.i("LifecycleEvent", "onStart")
    }

}