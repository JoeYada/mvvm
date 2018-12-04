package com.example.joe.mvvm.di.fragment

import com.example.joe.mvvm.di.factories.AddCountryViewModelFactory
import com.example.joe.mvvm.ui.AddCountryDialogFragment
import dagger.Subcomponent

@FragmentScope
@Subcomponent(modules = [FragmentModule::class])
interface FragmentComponent {

    fun getAddCountryViewModel(): AddCountryViewModelFactory

    fun inject(addCountryDialogFragment: AddCountryDialogFragment)

}