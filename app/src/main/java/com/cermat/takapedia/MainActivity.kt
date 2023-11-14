package com.cermat.takapedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnDaftar = findViewById<Button>(R.id.btnDaftar)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnDaftar.setOnClickListener {
            Intent(this, register::class.java).also {
                startActivity(it)
            }
        }
        btnLogin.setOnClickListener {
            Intent(this, login::class.java).also {
                startActivity(it)
            }
        }

    }
}