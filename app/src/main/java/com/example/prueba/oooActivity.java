package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class oooActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ooo);
        Toast.makeText(this,"Hola soy emanuel y adrian hola", Toast.LENGTH_LONG).show();
        Toast.makeText(this,"adsvcsa", Toast.LENGTH_LONG).show();
        Toast.makeText(this,"Hola soy emanuel y adrian hola Mundo", Toast.LENGTH_LONG).show();


    }
}