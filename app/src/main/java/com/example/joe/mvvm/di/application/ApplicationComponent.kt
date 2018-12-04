package com.example.joe.mvvm.di.application

import com.example.joe.mvvm.data.repository.RepositoryImpl
import com.example.joe.mvvm.di.activity.ActivityComponent
import com.example.joe.mvvm.di.activity.ActivityModule
import dagger.Component

@ApplicationScope
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun newActivityComponent(activityModule: ActivityModule): ActivityComponent

    fun getRepository(): RepositoryImpl
}