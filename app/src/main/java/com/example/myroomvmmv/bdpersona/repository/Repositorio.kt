package com.example.myroomvmmv.bdpersona.repository

import androidx.lifecycle.LiveData
import com.example.myroomvmmv.bdpersona.dao.PersonaDao
import com.example.myroomvmmv.bdpersona.entity.Persona

class PersonaRepository(private val personaDao: PersonaDao) {

    val todasLasPersonas: LiveData<List<Persona>> = personaDao.obtenerTodas()

    suspend fun insertar(persona: Persona) {
        personaDao.insertar(persona)
    }
}
