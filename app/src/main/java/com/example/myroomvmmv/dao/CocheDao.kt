package com.example.myroomvmmv.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import com.example.myroomvmmv.entity.Coche

@Dao
interface CocheDao {

    @Insert
    suspend fun insertarCoche(coche: Coche): Long

    @Delete
    suspend fun borrarCoche(coche: Coche)
}