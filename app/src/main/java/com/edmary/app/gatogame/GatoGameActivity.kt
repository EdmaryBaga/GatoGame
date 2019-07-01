package com.edmary.app.gatogame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class GatoGameActivity : AppCompatActivity() {

    lateinit var b11 :Button
    lateinit var b12 :Button
    lateinit var b13 :Button
    var cont=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tablero_ui)

        b11= findViewById(R.id.btn_1_1)
        b13 = findViewById(R.id.btn_1_3);

        b13.setOnClickListener {
            val texto= b13.text.toString()
            Toast.makeText(this,texto, Toast.LENGTH_LONG).show()
        }

        b11.setOnClickListener {
            b11.setText(realizaTiro())
        }

    }

    fun realizaTiro(): String {
        if(cont%2==0) return "O"
        else return "X"
    }

    fun verificaTiro(){

    }

}
