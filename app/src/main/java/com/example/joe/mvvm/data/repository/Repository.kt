package com.example.joe.mvvm.data.repository

import android.arch.lifecycle.LiveData
import com.example.joe.mvvm.data.entities.Country

interface Repository {
    fun getMedals(): LiveData<List<Country>>
    fun insertCountry(country: Country)
}