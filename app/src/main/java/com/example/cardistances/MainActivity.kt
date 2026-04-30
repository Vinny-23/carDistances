package com.example.cardistances

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //ViewCompat
        //Code goes below here
        //Declarations
        //UI Elements

    }
    val edtAmount = findViewById<EditText>(R.id.etdAmount)
    val edtDistance = findViewById<EditText>(R.id.edtDistance)
    val btnRange = findViewById<Button>(R.id.btnRange)
    val edtResult = findViewById<TextView>(R.id.edtResult)


}