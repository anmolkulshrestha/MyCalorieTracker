package com.example.mycalorietracker.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data class Run(
    var image:Bitmap?=null,
    var timestamp:Long=0L,
    var distanceTravelled:Int=0,
    var avgSpeedInKmph:Float=0f,
    var timeInMilliSeconds :Long=0L,
    var calorieBurned:Int=0
) {@PrimaryKey(autoGenerate = true)
    var id:Int?=null
}