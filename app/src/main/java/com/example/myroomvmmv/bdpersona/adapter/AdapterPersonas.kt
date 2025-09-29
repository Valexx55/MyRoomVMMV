package com.example.myroomvmmv.bdpersona.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.myroomvmmv.databinding.FilaPersonaBinding
import com.example.myroomvmmv.bdpersona.entity.Persona

class AdapterPersonas (var listaPersonas:List<Persona>): Adapter<PersonaVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaVH {
        var filaPersona = FilaPersonaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonaVH(filaPersona)
    }

    override fun getItemCount(): Int {
       return listaPersonas.size
    }

    override fun onBindViewHolder(holder: PersonaVH, position: Int) {
        val personaActual = this.listaPersonas[position]
        holder.rellenarFila(personaActual)
    }
}