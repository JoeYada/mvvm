package com.example.joe.mvvm.data.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.joe.mvvm.common.DATABSE_VERSION
import com.example.joe.mvvm.data.entities.Country
import com.example.joe.mvvm.data.Doa.CountryMedalsDao

@Database(entities = [Country::class], version = DATABSE_VERSION)
abstract class Database: RoomDatabase(){
    abstract fun countryMedalsDao(): CountryMedalsDao
}