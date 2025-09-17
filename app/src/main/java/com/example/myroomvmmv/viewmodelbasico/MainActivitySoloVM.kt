package com.example.myroomvmmv.viewmodelbasico

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.myroomvmmv.R

class MainActivitySoloVM : AppCompatActivity() {
    private lateinit var viewModel: CounterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_solo_vm)

        viewModel = ViewModelProvider(this).get(CounterViewModel::class.java)

        val textView = findViewById<TextView>(R.id.textView1)
        val button = findViewById<Button>(R.id.button1)

        // Mostrar valor inicial
        textView.text = viewModel.counter.toString()

        button.setOnClickListener {
            viewModel.increment()
            // Actualizar texto con nuevo valor
            textView.text = viewModel.counter.toString()
        }
    }
}