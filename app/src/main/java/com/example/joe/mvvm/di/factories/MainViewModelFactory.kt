package com.example.joe.mvvm.di.factories

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.joe.mvvm.data.repository.RepositoryImpl
import com.example.joe.mvvm.ui.MainViewModel
import javax.inject.Inject

class MainViewModelFactory@Inject constructor(val repository: RepositoryImpl): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(MainViewModel::class.java)) MainViewModel(repository) as T
        else throw IllegalArgumentException("ViewModel not found")
    }
}