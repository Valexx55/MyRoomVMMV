package com.example.myroomvmmv.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.myroomvmmv.entity.Persona
import com.example.myroomvmmv.entity.relaciones.PersonaConCoches

@Dao
interface PersonaDao {
    @Insert
    suspend fun insertarPersona(persona: Persona): Long

    @Delete
    suspend fun borrarPersona(persona: Persona)

    @Transaction
    @Query("SELECT * FROM Persona WHERE personaId = :personaId")
    suspend fun obtenerPersonaConCoches(personaId: Long): PersonaConCoches?

    @Transaction
    @Query("""
        SELECT Persona.*, COUNT(Coche.cocheId) as totalCoches
        FROM Persona
        LEFT JOIN Coche ON Persona.personaId = Coche.duenoId
        GROUP BY Persona.personaId
        ORDER BY totalCoches DESC
        LIMIT 1
    """)
    suspend fun obtenerPersonaConMasCoches(): PersonaConCoches?

    @Query("SELECT * FROM Persona")
    suspend fun getTodasLasPersonas(): List<Persona>


}