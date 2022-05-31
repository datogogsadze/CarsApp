package com.example.davaleba

import android.app.Application
import androidx.room.Room

class App : Application {

    companion object {
        lateinit var instance: App
                private set

    }
    lateinit var gh: AppDatabase


    lateinit var instance: App
        private set
    private lateinit var gh: AppDatabase

    override fun onCreate() {
        super.onCreate()

        instance = this

        gh = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
             "MY_APP_GH"
        ).allowMainThreadQueries().build()

    }

}