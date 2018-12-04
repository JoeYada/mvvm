package com.example.joe.mvvm.ui

import android.arch.lifecycle.ViewModel
import com.example.joe.mvvm.data.entities.Country
import com.example.joe.mvvm.data.repository.RepositoryImpl

class AddCountryViewModel(val repository: RepositoryImpl): ViewModel() {
    fun insertCountry(countryName: String, goldMedals: String, silverMedals:String, bronzeMedals:String){
        val country = Country(
            countryName = countryName,
            goldMedals = goldMedals.toInt(),
            silverMedals = silverMedals.toInt(),
            bronzeMedals = bronzeMedals.toInt()
        )
        repository.insertCountry(country)
    }
}