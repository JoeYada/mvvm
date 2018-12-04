package com.example.joe.mvvm.adapters

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.joe.mvvm.data.entities.Country
import com.example.joe.mvvm.R
import com.example.joe.mvvm.databinding.RecyclerItemBinding

class CountryMedalsAdapter(var countryList: List<Country>): RecyclerView.Adapter<CountryMedalsAdapter.ViewHolder>() {
    lateinit var context: Context

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): CountryMedalsAdapter.ViewHolder {

        val binding = DataBindingUtil.inflate<RecyclerItemBinding>(
            LayoutInflater.from(viewGroup.context),
            R.layout.recycler_item, viewGroup, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = countryList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var temp = countryList[position]
        holder.binding.apply{
            countryName.text = temp.countryName
            tvBronze.text = temp.bronzeMedals.toString()
            tvSilver.text = temp.silverMedals.toString()
            tvGold.text = temp.goldMedals.toString()
            tvTotal.text = "Total ${temp.TotalMedals}"
        }
    }

    class ViewHolder(val binding: RecyclerItemBinding): RecyclerView.ViewHolder(binding.root)

}