package com.example.davaleba

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CARS")
data class name (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    val id: Long? = null,

    @ColumnInfo(name = "NAME")
    val name: String?,

    @ColumnInfo(name = "ENGINE")
    val engine: Float?,

    @ColumnInfo(name = "CAR _ REALESE _ YEAR")
    val year: Int?

)