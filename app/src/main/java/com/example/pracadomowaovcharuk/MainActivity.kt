package com.example.pracadomowaovcharuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var liczba = 1;

        findViewById<Button>(R.id.prawo).setOnClickListener {
            if(liczba == 4)
                liczba = 1;
            else
                liczba +=1;

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
                liczba -=1;

            if(liczba == 1)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.kot);
            else if(liczba == 2)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.pies);
            else if(liczba == 3)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.niedzwiedz);
            else if(liczba == 4)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.lis);

        }
    }
}