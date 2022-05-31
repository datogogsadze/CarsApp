package com.example.davaleba

import android.speech.tts.TextToSpeech
import androidx.room.*

@Dao
interface CarDao {

    @Query("SELECT * FROM CARS")
    fun getAllCars() : List<name>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg cars: name)

    @Query("SELECT * FROM CARS C WHERE C.NAME LIKE :name AND C.ENGINE > :engine")
    fun getByNameAndEngine(name: String, engine: Float): List<name>

    @Delete
    fun delete(car: name)

    @Query("DELETE FROM CARS")
    fun deleteALL()
}