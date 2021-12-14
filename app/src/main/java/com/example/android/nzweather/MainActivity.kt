package com.example.android.nzweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.nzweather.ui.base.BaseFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, BaseFragment.newInstance())
                .commitNow()
        }
    }
}