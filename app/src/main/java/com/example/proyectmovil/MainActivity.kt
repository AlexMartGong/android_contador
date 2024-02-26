package com.example.proyectmovil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var cont: Int = 0
    var aux: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtConteo = findViewById<TextView>(R.id.txtConteo)
        val btnContador = findViewById<Button>(R.id.btnCuenta)
        val btnReset = findViewById<Button>(R.id.btnReset)

        btnContador.setOnClickListener {

            if (cont != 9 && aux == 0) {
                cont++
                "Increased".also { btnContador.text = it }
                txtConteo.text = "$cont"
                if (cont == 9) {
                    aux = 1
                }
            } else if (cont <= 9 && aux == 1) {
                aux = 1
                cont--
                "Decremented".also { btnContador.text = it }
                txtConteo.text = "$cont"

                if (cont == 0) {
                    aux = 0;
                }

            }
        }

        btnReset.setOnClickListener{
            txtConteo.text = "0"
            "Increased".also { btnContador.text = it }
            cont = 0
            aux = 0
        }

    }
}