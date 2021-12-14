package com.example.android.nzweather.di

import com.example.android.nzweather.model.repository.Repository
import com.example.android.nzweather.model.repository.RepositoryImp
import com.example.android.nzweather.ui.base.BaseViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

// This file dependency injection for koin framework

val appModule = module {

    single<Repository> { RepositoryImp() }  // realisation of a repository

//View models
    viewModel { BaseViewModel(get()) }     //searching view model
}