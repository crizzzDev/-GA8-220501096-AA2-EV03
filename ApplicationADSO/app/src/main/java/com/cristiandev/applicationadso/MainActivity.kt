package com.cristiandev.applicationadso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity // Import para centrar el Toast
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button // Declara la variable button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializa el botón aquí
        button = findViewById(R.id.button)

        // Configurar el clic del botón
        button.setOnClickListener {
            animateButton(it)  // Llama a la función de animación
            MetodoBoton(it)    // Llama a tu método existente
        }
    }

    private fun animateButton(view: View) {
        // Cargar la animación de escala
        val scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.button_scale)
        view.startAnimation(scaleAnimation) // Aplicar la animación al botón
    }

    fun MetodoBoton(view: View) {
        val toast = Toast.makeText(this, "Bienvenido a My Fitness Mood", Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER, 0, 0) // Centrar el Toast
        toast.show()
    }
}
