package com.example.myroomvmmv.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Persona(
    @PrimaryKey(autoGenerate = true) val personaId: Long = 0,
    val nombre: String,
    val edad: Int
)