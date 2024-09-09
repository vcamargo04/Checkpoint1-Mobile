package com.example.checkpoint_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forgotPassword = findViewById<TextView>(R.id.textView3)
        forgotPassword.setOnClickListener {
            val intent = Intent(this@MainActivity, EsqueceuSenha::class.java)
            startActivity(intent)
        }

        val integrantesButton = findViewById<Button>(R.id.button5)
        integrantesButton.setOnClickListener {
            val intent = Intent(this@MainActivity, IntegrantesActivity::class.java)
            startActivity(intent)
        }
    }
}
