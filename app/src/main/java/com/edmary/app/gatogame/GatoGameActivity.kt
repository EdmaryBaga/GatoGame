package com.edmary.app.gatogame

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView


class GatoGameActivity : AppCompatActivity() {

    private lateinit var b11 :Button
    private lateinit var b12 :Button
    private lateinit var b13 :Button
    private lateinit var b21 :Button
    private lateinit var b22 :Button
    private lateinit var b23 :Button
    private lateinit var b31 :Button
    private lateinit var b32 :Button
    private lateinit var b33 :Button
    private lateinit var ganador:TextView
    private  var turno:String ="X"
    private lateinit var reiniciar :Button
    private var cont :Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tablero_ui)

        b11 = findViewById(R.id.btn_1_1)
        b12 = findViewById(R.id.btn_1_2)
        b13 = findViewById(R.id.btn_1_3)
        b21 = findViewById(R.id.btn_2_1)
        b22 = findViewById(R.id.btn_2_2)
        b23 = findViewById(R.id.btn_2_3)
        b31 = findViewById(R.id.btn_3_1)
        b32 = findViewById(R.id.btn_3_2)
        b33 = findViewById(R.id.btn_3_3)
        ganador = findViewById(R.id.ganador)
        reiniciar = findViewById(R.id.reiniciar)

        reiniciar.setOnClickListener {
            val intent = intent
            finish()
            startActivity(intent)
        }

        b11.setOnClickListener {
            b11.setText(realizaTiro())
            cont+=1
            b11.isClickable = false
            verificaTiro(11)
        }

        b12.setOnClickListener {
            turno=realizaTiro()
            b12.setText(turno)
            cont+=1
            b12.isClickable = false
            verificaTiro(12)
        }

        b13.setOnClickListener {
            turno=realizaTiro()
            b13.setText(turno)
            cont+=1
            b13.isClickable = false
            verificaTiro(13)
        }

        b21.setOnClickListener {
            turno=realizaTiro()
            b21.setText(turno)
            cont+=1
            b21.isClickable = false
            verificaTiro(21)
        }

        b22.setOnClickListener {
            turno=realizaTiro()
            b22.setText(turno)
            cont+=1
            b22.isClickable = false
            verificaTiro(22)
        }

        b23.setOnClickListener {
            turno=realizaTiro()
            b23.setText(turno)
            cont+=1
            b23.isClickable = false
            verificaTiro(23)
        }

        b31.setOnClickListener {
            turno=realizaTiro()
            b31.setText(turno)
            cont+=1
            b31.isClickable = false
            verificaTiro(31)
        }

        b32.setOnClickListener {
            turno=realizaTiro()
            b32.setText(turno)
            cont+=1
            b32.isClickable = false
            verificaTiro(32)
        }

        b33.setOnClickListener {
            turno=realizaTiro()
            b33.setText(turno)
            cont+=1
            b33.isClickable = false
            verificaTiro(33)
        }
    }

    fun realizaTiro(): String {
        if(cont%2==0) return "O"
        else return "X"
    }

    fun verificaTiro(pos:Int){
       verificaHorizontales(this.turno)
        verificaVertical(this.turno)
        if (pos==11 || pos ==22 || pos==33 || pos == 31 || pos==13){
            verificaDiagonal(turno)
        }
    }

    fun verificaHorizontales(turno:String){
        if(b11.text.toString()==turno && b12.text.toString()==turno && b13.text.toString()==turno){
            ganador.text = "El ganador es ${turno}"
            hayGanador()
        }else if (b21.text.toString()==turno && b22.text.toString()==turno && b23.text.toString()==turno){
            ganador.text = "El ganador es ${turno}"
            hayGanador()
        }
        else if (b31.text.toString()==turno && b32.text.toString()==turno && b33.text.toString()==turno){
            ganador.text = "El ganador es ${turno}"
            hayGanador()
        }
    }

    fun verificaVertical(turno:String){

        if(b11.text.toString()==turno && b21.text.toString()==turno && b31.text.toString()==turno){
            ganador.text = "El ganador es ${turno}"
            hayGanador()
        }else if (b12.text.toString()==turno && b22.text.toString()==turno && b32.text.toString()==turno){
            ganador.text = "El ganador es ${turno}"
            hayGanador()
        }
        else if (b13.text.toString()==turno && b23.text.toString()==turno && b33.text.toString()==turno){
            ganador.text = "El ganador es ${turno}"
            hayGanador()
        }
    }

    fun verificaDiagonal(turno: String){
        if(b11.text.toString()==turno && b22.text.toString()==turno && b33.text.toString()==turno){
            ganador.text = "El ganador es ${turno}"
            hayGanador()
        }else if (b13.text.toString()==turno && b22.text.toString()==turno && b31.text.toString()==turno){
            ganador.text = "El ganador es ${turno}"
            hayGanador()
        }
    }

    fun hayGanador(){
        b11.isClickable = false
        b12.isClickable = false
        b13.isClickable = false
        b21.isClickable = false
        b22.isClickable = false
        b23.isClickable = false
        b31.isClickable = false
        b32.isClickable = false
        b33.isClickable = false
    }




}
