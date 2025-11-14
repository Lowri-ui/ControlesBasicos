package com.example.controlesbasicos;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity54 extends AppCompatActivity  {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Enlazamos el XML con la actividad
        setContentView(R.layout.activity_5_4);

        EditText editTextPhone = findViewById(R.id.editTextPhone);
        EditText editTextNumber = findViewById(R.id.editTextNumber);
        EditText editTextEmail = findViewById(R.id.editTextEmail);
        EditText editTextPin = findViewById(R.id.editTextNumberPassword);

        enableKeyboardOnFocus(editTextNumber);
        enableKeyboardOnFocus(editTextEmail);
        enableKeyboardOnFocus(editTextPin);
        enableKeyboardOnFocus(editTextPhone);
    }
    private void enableKeyboardOnFocus(EditText editText) {
        editText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                editText.requestFocus();
                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT);
                return false; // permitir que el evento continúe normalmente
            }
        });

    }
}
