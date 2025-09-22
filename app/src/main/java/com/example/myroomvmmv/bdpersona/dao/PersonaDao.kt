package com.example.myroomvmmv.bdpersona.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myroomvmmv.bdpersona.entity.Persona

@Dao
interface PersonaDao {
    @Insert
    suspend fun insertar(persona: Persona)

    @Query("SELECT * FROM personas ORDER BY nombre ASC")
    fun obtenerTodas(): LiveData<List<Persona>>
}
