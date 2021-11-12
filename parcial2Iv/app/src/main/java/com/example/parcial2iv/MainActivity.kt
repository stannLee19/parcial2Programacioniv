package com.example.parcial2iv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.*

class MainActivity : AppCompatActivity() {


    private lateinit var tv_Mostrar: TextView
    private lateinit var lv_Lista: ListView

    private val Mascota = arrayOf("alfonso", "german", "rodrigo", "Cristian", "jack")

    private val Especie = arrayOf("canino", "felino", "reptil", "roedor", "insecto")

    private val color = arrayOf("Gris", "Negro", "Blanco", "Cafe", "Gris, Blanco")

    private val sexo = arrayOf("Masculino", "Masculino", "Masculino", "Masculino", "Masculino")

    private val peso = arrayOf("10 Kg", "2 Kg", "3 Kg", "0.5 Kg", "0.1 Kg",)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_Mostrar = findViewById(R.id.tv_Mostrar)
        lv_Lista = findViewById(R.id.lv_Lista)

        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1, Mascota)
        lv_Lista.adapter = adaptador

        lv_Lista.setOnItemClickListener { AdapterView, view, i, l ->
            tv_Mostrar.setText(
                "La informacion de " + lv_Lista.getItemAtPosition(i) + " es un : " + Especie[i] + " con color: " + color[i] + ", sexo: " +
                        sexo[i] + ", con un peso de: " + peso[i]
            )

        }
    }
}