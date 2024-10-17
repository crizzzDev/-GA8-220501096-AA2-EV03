package com.cristiandev.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Método para mostrar el mensaje de bienvenida
    fun MetodoBoton(view: View) {
        Toast.makeText(this, "Bienvenido a My Fitness Mood", Toast.LENGTH_LONG).show()
    }
}
