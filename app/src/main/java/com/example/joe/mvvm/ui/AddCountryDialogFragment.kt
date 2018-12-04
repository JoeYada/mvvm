package com.example.joe.mvvm.ui

import android.databinding.DataBindingUtil
import android.nfc.Tag
import android.os.Bundle
import android.support.design.widget.BottomSheetDialogFragment
import android.support.design.widget.TabLayout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.joe.mvvm.R
import com.example.joe.mvvm.databinding.AddCountryBinding
import com.example.joe.mvvm.di.fragment.FragmentModule
import kotlinx.android.synthetic.main.add_country.*
import javax.inject.Inject

class AddCountryDialogFragment : BottomSheetDialogFragment() {

    var TAG: String = "AddCountry"
    @Inject
    lateinit var addCountryViewModel: AddCountryViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<AddCountryBinding>(
            inflater, R.layout.add_country, container, false)
        injectDependancies()
        saveButton()
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

    private fun injectDependancies() {
      (activity as MainActivity).activityComponent.newFragmentcomponent(FragmentModule(this))
          .inject(this)
    }

    private fun saveButton() {
        btnSave.setOnClickListener {
            addCountryViewModel.insertCountry(
                etCountry?.text.toString(),
                etGold?.text.toString(),
                etSilver?.text.toString(),
                etBronze?.text.toString())
            }
        dismiss()
    }
}