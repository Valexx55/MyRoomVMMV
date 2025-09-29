package com.example.myroomvmmv.bdpersona.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.myroomvmmv.bdpersona.entity.Persona
import com.example.myroomvmmv.databinding.FilaPersonaBinding

class PersonaVH(val filaPersona:FilaPersonaBinding):ViewHolder(filaPersona.root) {

    fun rellenarFila (persona:Persona)
    {
        this.filaPersona.id.text = persona.id.toString()
        this.filaPersona.nombre.text = persona.nombre
        this.filaPersona.edad.text = persona.edad.toString()
    }
}