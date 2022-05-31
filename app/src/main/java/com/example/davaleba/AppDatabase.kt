package com.example.davaleba

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [name::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun getCarDao() : CarDao


}