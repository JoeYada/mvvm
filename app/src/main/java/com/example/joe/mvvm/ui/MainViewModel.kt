package com.example.joe.mvvm.ui

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import com.example.joe.mvvm.adapters.CountryMedalsAdapter
import com.example.joe.mvvm.data.repository.RepositoryImpl

class MainViewModel(private val repository: RepositoryImpl): ViewModel() {
    fun getMedals(): LiveData<CountryMedalsAdapter>{
        return Transformations.map(repository.getMedals()){
            CountryMedalsAdapter(it)
        }
    }
}