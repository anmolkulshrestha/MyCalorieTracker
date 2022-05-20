package com.example.mycalorietracker.db

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream

class Converters {
    @TypeConverter
fun tobitmap(byt:ByteArray):Bitmap{
    return BitmapFactory.decodeByteArray(byt,0,byt.size)
}

@TypeConverter
    fun frombitmap(bmp:Bitmap):ByteArray{
        val outputstream = ByteArrayOutputStream()
        bmp.compress(Bitmap.CompressFormat.PNG,100,outputstream)
        return outputstream.toByteArray()
    }
}