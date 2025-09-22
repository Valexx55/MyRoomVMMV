package com.example.myroomvmmv.bdpersona.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.myroomvmmv.bdpersona.db.AppDatabase
import com.example.myroomvmmv.bdpersona.entity.Persona
import com.example.myroomvmmv.bdpersona.repository.PersonaRepository
import kotlinx.coroutines.launch

class PersonaViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: PersonaRepository
    val personas: LiveData<List<Persona>>

    init {
        val dao = AppDatabase.getDatabase(application).personaDao()
        repository = PersonaRepository(dao)
        personas = repository.todasLasPersonas
    }

    fun insertar(persona: Persona) = viewModelScope.launch {
        repository.insertar(persona)
    }
}
