package com.example.joe.mvvm.data.repository

import android.arch.lifecycle.LiveData
import com.example.joe.mvvm.data.entities.Country
import com.example.joe.mvvm.data.database.Database
import javax.inject.Inject

class RepositoryImpl@Inject constructor(private val database: Database): Repository {
    override fun getMedals(): LiveData<List<Country>> = database.countryMedalsDao().getCountries()

    override fun insertCountry(country: Country) {
        Thread{
            database.countryMedalsDao().insertCountry(country)
       }.start()
    }
}