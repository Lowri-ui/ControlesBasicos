package com.example.controlesbasicos;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity56 extends AppCompatActivity implements View.OnClickListener {

    // Declaración de variables globales de la Activity
    ProgressBar progressBar; // barra de progreso
    TextView porcentaje;     // texto que muestra el porcentaje
    Button button;           // botón para iniciar la carga
    Handler handler;         // manejador para controlar el delay del progreso
    int progreso = 0;        // valor actual de la barra (0 a 100)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_6_progress_bar);

        // ASIGNAMOS LOS IDs DEL LAYOUT A NUESTRAS VARIABLES
        progressBar = findViewById(R.id.progressBar);
        porcentaje = findViewById(R.id.porcentaje);
        button = findViewById(R.id.button);

        // Listener del botón, para que al pulsarlo ejecute onClick
        button.setOnClickListener(this);

        // Inicializamos el Handler para usar postDelayed más adelante
        handler = new Handler();
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            iniciarCarga(); // llamamos a la función que llena la ProgressBar
        }
    }

    private void iniciarCarga() {
        // Reiniciamos todo a cero
        progreso = 0;
        progressBar.setProgress(0);
        porcentaje.setText("0 %");

        // Usamos handler para actualizar la barra cada cierto tiempo
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (progreso < 100) {
                    // Aumentamos el progreso y actualizamos la barra y el texto
                    progreso += 5;
                    progressBar.setProgress(progreso);
                    porcentaje.setText(progreso + " %");

                    // Volvemos a ejecutar este mismo Runnable después de 200ms
                    handler.postDelayed(this, 200); // velocidad de carga
                } else {
                    // Cuando llegamos a 100%, mostramos el porcentaje final
                    progressBar.setProgress(100);
                    porcentaje.setText("100 %");

                    // PASAMOS A LA SIGUIENTE ACTIVITY
                    Intent intent = new Intent(Activity56.this, Imagen.class);
                    startActivity(intent);

                    // Cerramos esta Activity para que no se pueda volver atrás
                    finish();
                }
            }
        }, 200); // primer delay antes de empezar a actualizar
    }
}
