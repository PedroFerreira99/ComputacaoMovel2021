package com.example.computacaomovel2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun butaoCriarConta(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        Toast.makeText(this, "Conta criada", Toast.LENGTH_SHORT).show()
        startActivity(intent)
    }
}