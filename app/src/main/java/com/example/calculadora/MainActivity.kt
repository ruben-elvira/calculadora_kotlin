package com.example.calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun salir(view: View) {
        finish()
    }

    fun entrar(view: View) {

        var nombree = findViewById<EditText>(R.id.editnombre)
        var name = nombree.text.toString()
        var miIntent = Intent(this, Calculadoraa::class.java)
        miIntent.putExtra("nombre", name)
        startActivity(miIntent)
    }
}
