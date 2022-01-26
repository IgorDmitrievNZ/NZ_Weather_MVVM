package com.example.android.nzweather.ui.home

import android.util.Log
import androidx.lifecycle.*
import com.example.android.nzweather.AppState
import com.example.android.nzweather.model.repository.Repository
import java.lang.Thread.sleep

class HomeViewModel(private val repository: Repository) : ViewModel(), LifecycleObserver {
    private val liveData: MutableLiveData<AppState> = MutableLiveData()

    fun getLiveData(): LiveData<AppState> = liveData

    fun getWeatherFromLocalSourceNorth() = getDataFromLocalSource(true)

    fun getWeatherFromLocalSourceSouth() = getDataFromLocalSource(false)

    private fun getDataFromLocalSource(isNorthIsland: Boolean) {
        liveData.value = AppState.Loading
        Thread {
            sleep(2000)
            liveData.postValue(
                if (isNorthIsland) {
                    AppState.Success(repository.getWeatherFromLocalStorageNorthIsland())
                } else {
                    AppState.Success(repository.getWeatherFromLocalStorageSouthIsland())
                }
            )
        }.start()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private fun onViewStart() {
        Log.i("LifecycleEvent", "onStart")
    }

}