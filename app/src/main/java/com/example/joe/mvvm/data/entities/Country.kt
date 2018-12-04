package com.example.joe.mvvm.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.example.joe.mvvm.common.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class Country(
    @PrimaryKey(autoGenerate = true)
    val countryId: Int? = null,
    val countryName: String,
    val goldMedals: Int,
    val silverMedals: Int,
    val bronzeMedals: Int,
    val TotalMedals: Int = goldMedals + silverMedals + bronzeMedals
)