package com.example.controlesbasicos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Activity53 extends AppCompatActivity implements View.OnClickListener{

    private TextView tvMensaje;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_5_3_java);


        //Añadimos los listeners a los botones
        Button btn1 = findViewById(R.id.btnBoton1);
        Button btn2 = findViewById(R.id.btnBoton2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId(); //Obtenemos el id una vez

        //1. Obtenemos las referencias a todas las vistas necesarias
        tvMensaje = findViewById(R.id.tvMensaje);

        if (id == R.id.btnBoton1){
            tvMensaje.setText(R.string.boton_1_pulsado);
            tvMensaje.setTextColor(ContextCompat.getColor(Activity53.this,R.color.custom_blue));
        } else if (id == R.id.btnBoton2) {
            tvMensaje.setText(R.string.boton_2_pulsado);
            tvMensaje.setTextColor(ContextCompat.getColor(Activity53.this, R.color.custom_green));
        }else {
            //Código por defecto
        }
    }
}
