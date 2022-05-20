package com.example.mycalorietracker.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertrun(run:Run)

    @Delete
    suspend fun deleterun(run: Run)

    @Query("SELECT * FROM running_table ORDER BY timestamp DESC")
    fun getallruns():LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY calorieBurned DESC")
    fun getallrunsorderbycalorie():LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY timeInMilliSeconds DESC")
    fun getallrunsorderbytimeinmilliseconds():LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY distanceTravelled DESC")
    fun getallrunsorderbydistancetravelled():LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY avgSpeedInKmph DESC")
    fun getallrunsorderbyavgspeedinkmph():LiveData<List<Run>>

    @Query("SELECT SUM(distanceTravelled) FROM running_table")
    fun totaldistancetravelled():LiveData<Int>

    @Query("SELECT AVG(avgSpeedInKmph) FROM running_table")
    fun gettotalavgspeed():LiveData<Float>

    @Query("SELECT SUM(timeInMilliSeconds) FROM running_table")
    fun gettotaltimeofrunning():LiveData<Long>

    @Query("SELECT SUM(calorieBurned) FROM running_table")
    fun gettotalcaloriesburned():LiveData<Int>

}