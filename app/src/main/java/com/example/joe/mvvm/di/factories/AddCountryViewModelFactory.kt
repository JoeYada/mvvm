package com.example.joe.mvvm.di.factories

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.joe.mvvm.data.repository.RepositoryImpl
import com.example.joe.mvvm.ui.AddCountryViewModel
import java.lang.IllegalArgumentException
import javax.inject.Inject

class AddCountryViewModelFactory@Inject constructor(val repository: RepositoryImpl): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(AddCountryViewModel::class.java)) AddCountryViewModel(repository) as T
        else throw IllegalArgumentException("View Model Not Found")
    }
}