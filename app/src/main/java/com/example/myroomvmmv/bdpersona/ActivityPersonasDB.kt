package com.example.myroomvmmv.bdpersona

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myroomvmmv.R
import androidx.lifecycle.Observer
import com.example.myroomvmmv.bdpersona.adapter.AdapterPersonas
import com.example.myroomvmmv.bdpersona.entity.Persona
import com.example.myroomvmmv.bdpersona.viewmodel.PersonaViewModel
import com.example.myroomvmmv.databinding.ActivityPersonasDbBinding

class ActivityPersonasDB : AppCompatActivity() {

    val personas: MutableList<Persona> = mutableListOf()
    lateinit var binding:ActivityPersonasDbBinding
    lateinit var adapterPersonas: AdapterPersonas

    private val personaViewModel: PersonaViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonasDbBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapterPersonas = AdapterPersonas(personas)
        binding.recview.adapter = adapterPersonas


        // Observador para la lista de personas
        personaViewModel.personas.observe(this, Observer { personas ->
            // Aquí puedes actualizar la UI con la lista de personas
            // Por ejemplo, mostrarla en un RecyclerView o algo similar
            personas?.let {
                // Tu lógica para manejar la lista
                Log.d("MIAPP", "Personas: $it")
                adapterPersonas = AdapterPersonas(it)
                adapterPersonas.notifyDataSetChanged()

            }


        })
    }

    fun insertarPersona(view: View) {
        //TODO insertar Persona y tener una lista actualizada con liveData que mostremos por LOG
        personaViewModel.insertar(Persona(nombre ="vale", edad =40))
    }
}