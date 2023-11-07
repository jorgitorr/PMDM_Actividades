package com.jorgearceruiz97.actividad01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var boton: Button
    private lateinit var textView: TextView
    private var contadorClicks = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Button boton = findViewById(R.id.boton)
        //TextView textView = findViewById(R.id.textView)
        boton = findViewById(R.id.boton)
        textView = findViewById(R.id.textView)

        boton.setOnClickListener{
            contadorClicks++;

            when(contadorClicks){
                1->{
                    textView.text = "Haz hecho click una vez"
                }
                2->{
                    textView.text = "Has hecho click dos veces!"
                }
                3 ->{
                    textView.text = "Has hecho click tres veces!"
                }
                4 ->{
                    textView.text = "Has hecho click cuatro veces!"
                }
            }

            if(contadorClicks<5){
                textView.textSize = 24f
            }else if(contadorClicks>9){
                textView.text = "Te has pasado de clicks!"
                boton.isEnabled = false //desactiva el boton fisicamente
                Toast.makeText(this,"El boton ha sido deshabilitado",Toast.LENGTH_SHORT).show()
            }else{
                textView.textSize = 22f
                textView.text = "Has hecho click + " + contadorClicks + "veces!"
            }
        }
    }
}