package com.example.controlesbasicos;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class Imagen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen); //layout con el ImageView

        // Referencia al ImageView
        ImageView imagenGif = findViewById(R.id.imagenGif);

        // Cargar el GIF usando Glide
        Glide.with(this)
                .asGif() // asegura que sea un GIF
                .override(300, 300) // ancho y alto en píxeles del GIF
                .load(R.drawable.imagen_laura) // archivo GIF
                .into(imagenGif);
    }
}
