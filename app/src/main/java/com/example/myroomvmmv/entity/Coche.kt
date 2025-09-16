package com.example.myroomvmmv.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [ForeignKey(
        entity = Persona::class,
        parentColumns = ["personaId"],
        childColumns = ["duenoId"],
        onDelete = ForeignKey.CASCADE
    )],
    indices = [Index("duenoId")]
)
data class Coche(
    @PrimaryKey(autoGenerate = true) val cocheId: Long = 0,
    val modelo: String,
    val matricula: String,
    val duenoId: Long
)
