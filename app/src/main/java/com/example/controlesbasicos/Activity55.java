package com.example.controlesbasicos;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.controlesbasicos.R;

public class Activity55 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_5_5);
        TextView tvRes = findViewById(R.id.tvResultado);
        RadioGroup grupo = findViewById(R.id.radioGroupDias);

        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup group, int checkedId) {

                if (checkedId == R.id.rbLunes) {
                    tvRes.setText("ES LUNES");
                } else if (checkedId == R.id.rbMartes) {
                    tvRes.setText("ES MARTES");
                } else if (checkedId == R.id.rbMiercoles) {
                    tvRes.setText("ES MIERCOLES");
                } else if (checkedId == R.id.rbJueves) {
                    tvRes.setText("ES JUEVES");
                } else if (checkedId == R.id.rbViernes) {
                    tvRes.setText("ES VIERNES");
                } else if (checkedId == R.id.rbSabado) {
                    tvRes.setText("ES SABADO");
                } else if (checkedId == R.id.rbDomingo) {
                    tvRes.setText("ES DOMINGO");
                }
            }
        });
    }
}

