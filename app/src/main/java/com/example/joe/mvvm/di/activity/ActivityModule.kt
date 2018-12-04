package com.example.joe.mvvm.di.activity

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import com.example.joe.mvvm.R
import com.example.joe.mvvm.databinding.ActivityMainBinding
import com.example.joe.mvvm.di.factories.MainViewModelFactory
import com.example.joe.mvvm.ui.MainViewModel
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(val activity: AppCompatActivity){
    @Provides
    @ActivityScope
    fun providesMainViewModel(mainViewModelFactory: MainViewModelFactory) =
            ViewModelProviders.of(activity, mainViewModelFactory).get(MainViewModel::class.java)

    @Provides
    @ActivityScope
    fun providesMainActivityBinding() = DataBindingUtil.setContentView<ActivityMainBinding>(activity, R.layout.activity_main)
}