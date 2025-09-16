package com.example.myroomvmmv.entity.relaciones

import androidx.room.Embedded
import androidx.room.Relation
import com.example.myroomvmmv.entity.Coche
import com.example.myroomvmmv.entity.Persona

data class PersonaConCoches(
    @Embedded val persona: Persona,
    @Relation(
        parentColumn = "personaId",
        entityColumn = "duenoId"
    )
    val coches: List<Coche>
)

