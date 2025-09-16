package com.example.myroomvmmv

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.example.myroomvmmv.bd.DBRoomPersonasCoches
import com.example.myroomvmmv.entity.Persona
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var db: DBRoomPersonasCoches

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar Room directamente en la Activity
        db = Room.databaseBuilder(
            applicationContext,
            DBRoomPersonasCoches::class.java,
            "mi-base-de-datos"
        ).build()

        insertarPersonasYCoches()


    }

    fun insertarPersonasYCoches ()
    {
        lifecycleScope.launch {
            val personaDao = db.personaDao()
            val nuevaPersona = Persona(nombre = "Juan", edad = 30)
            personaDao.insertarPersona(nuevaPersona)

            // Verificar
            val personas = personaDao.getTodasLasPersonas()
            personas.forEach {
                Log.d("Persona", it.toString())
            }
        }

    }
}