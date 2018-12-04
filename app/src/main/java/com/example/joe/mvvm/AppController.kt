package com.example.joe.mvvm

import android.app.Application
import com.example.joe.mvvm.di.application.ApplicationComponent
import com.example.joe.mvvm.di.application.ApplicationModule
import com.example.joe.mvvm.di.application.DaggerApplicationComponent

class AppController: Application() {

    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }
}