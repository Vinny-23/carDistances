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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val edtAmount = findViewById<EditText>(R.id.etdAmount)
    val edtDistance = findViewById<EditText>(R.id.edtDistance)
    val btnRange = findViewById<Button>(R.id.btnRange)
    val edtResult = findViewById<TextView>(R.id.edtResult)

    btnRange.setClickListener
    {
        val edtAmount = etFuel.text.toString()
        val edtDistance = etDistance.text.toString()

        if (edtAmount.isNotEmpty() && consStr.isNotEmpty()) {
            val edtAmount = etFuel.toDouble()
            val edtDistance = etDistance.toDouble()

            //Functions appear here

            val edtAmount = arrayOf<String>(ammount, edtDistance)

            if (edtAmount.litres()) > edtAmount) {
                edtAmount = edtDistance()

            }

            val edtDistance = (Price)
            if (litres = 20l itres) {
                Amount("20")

            }
            val AmountRequired = 20("0 > 20")
            if (AmountRequired = 20L)

        }
        val edtResult (AmoutRequired: Amount, distance: String: 20litres)

        edtAmount = < 20
        edtDistance = ->

        val edtResult = 0 < 20("Display amount required")

    }
}
