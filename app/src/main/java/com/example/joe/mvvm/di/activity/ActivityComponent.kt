package com.example.joe.mvvm.di.activity

import com.example.joe.mvvm.di.factories.MainViewModelFactory
import com.example.joe.mvvm.di.fragment.FragmentComponent
import com.example.joe.mvvm.di.fragment.FragmentModule
import com.example.joe.mvvm.ui.MainActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {

    fun newFragmentcomponent(fragmentModule: FragmentModule): FragmentComponent

    fun getMainViewModelFactory(): MainViewModelFactory

    fun inject(mainActivity: MainActivity)
}