package com.example.joe.mvvm.di.fragment

import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.Fragment
import com.example.joe.mvvm.di.factories.AddCountryViewModelFactory
import com.example.joe.mvvm.ui.AddCountryViewModel
import dagger.Module
import dagger.Provides

@Module
class FragmentModule(val fragment: Fragment) {

    @Provides
    @FragmentScope
    fun providesAddCountryViewModel(addCountryViewModelFactory: AddCountryViewModelFactory) =
            ViewModelProviders.of(fragment, addCountryViewModelFactory)
                .get(AddCountryViewModel::class.java)
}