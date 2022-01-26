package com.example.android.nzweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.nzweather.ui.details.DetailsFragment
import com.example.android.nzweather.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, HomeFragment.newInstance())
                .commit()
        }
    }
}