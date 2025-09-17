package com.example.myroomvmmv.vmlistausuario

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UsuarioViewModel : ViewModel() {
    //private val _users = MutableLiveData<List<Usuario>>()
    //val users: LiveData<List<Usuario>> get() = _users
    val users =  MutableLiveData<List<Usuario>>()

    fun loadUsersIfNeeded() {
        if (users.value == null) {
            // Simula carga de datos en memoria
            val sampleUsers = listOf(
                Usuario("Ana", 25),
                Usuario("Luis", 30),
                Usuario("María", 22),
                Usuario("Carlos", 27),
                Usuario("Lucía", 19)
            )
            users.value = sampleUsers
        }
    }
}