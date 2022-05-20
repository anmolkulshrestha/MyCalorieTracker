package com.example.mycalorietracker.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Run::class],
version = 1)
@TypeConverters(Converters::class)
abstract class Database:RoomDatabase() {
    abstract fun getrundao():RunDao

}