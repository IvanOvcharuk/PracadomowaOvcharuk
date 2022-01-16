package com.example.pracadomowaovcharuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var liczba = 1;
        var skala = 1;

        findViewById<Button>(R.id.prawo).setOnClickListener {
            if(liczba == 4)
                liczba = 1;
            else
                liczba += 1;

            if(liczba == 1)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.kot);
            else if(liczba == 2)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.pies);
            else if(liczba == 3)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.niedzwiedz);
            else if(liczba == 4)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.lis);

        }
        findViewById<Button>(R.id.lewo).setOnClickListener {
            if(liczba == 1)
                liczba = 4;
            else
                liczba -= 1;

            if(liczba == 1)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.kot);
            else if(liczba == 2)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.pies);
            else if(liczba == 3)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.niedzwiedz);
            else if(liczba == 4)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.lis);

        }
        findViewById<Button>(R.id.buttonrl).setOnClickListener {
            var lewo = "-"+ findViewById<EditText>(R.id.editTextr).text;
            findViewById<ImageView>(R.id.obrazek).rotation = lewo.toString().toFloat();
        }
        findViewById<Button>(R.id.buttonrp).setOnClickListener {
            var prawo = findViewById<EditText>(R.id.editTextr).text;
            findViewById<ImageView>(R.id.obrazek).rotation = prawo.toString().toFloat();
        }
        findViewById<Button>(R.id.buttonskala).setOnClickListener {
            var skalaszerokosc = findViewById<EditText>(R.id.editTextskala).text;
            findViewById<ImageView>(R.id.obrazek).scaleX = skalaszerokosc.toString().toFloat();
        }
        findViewById<Button>(R.id.buttonskala2).setOnClickListener {
            var skalawysokosc = findViewById<EditText>(R.id.editTextskala2).text;
            findViewById<ImageView>(R.id.obrazek).scaleY = skalawysokosc.toString().toFloat();

        }
        findViewById<Button>(R.id.buttonprzez).setOnClickListener {
            var przezroczystosc = findViewById<EditText>(R.id.editTextprzez).text;
            findViewById<ImageView>(R.id.obrazek).alpha = przezroczystosc.toString().toFloat();
        }

    }
}