package com.example.joe.mvvm.ui

import android.arch.lifecycle.Observer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.example.joe.mvvm.AppController
import com.example.joe.mvvm.R
import com.example.joe.mvvm.common.BOTTOM_SHEET
import com.example.joe.mvvm.databinding.ActivityMainBinding
import com.example.joe.mvvm.di.activity.ActivityComponent
import com.example.joe.mvvm.di.activity.ActivityModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainViewModel: MainViewModel

    @Inject
    lateinit var mainBinding: ActivityMainBinding

    @Inject
    lateinit var activityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependancies()
        mainBinding.setLifecycleOwner(this)
        mainBinding.viewModel = mainViewModel
        mainViewModel.getMedals().observe(this, Observer {
            recyclerView.apply{
                adapter = it
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        })
    }

    fun addCountry(view: View){
        val fragment = AddCountryDialogFragment()
        fragment.show(supportFragmentManager, BOTTOM_SHEET)
    }

    private fun injectDependancies(){
        activityComponent =
                (application as AppController).applicationComponent.newActivityComponent(ActivityModule(this))
        activityComponent.inject(this)
    }
}
