package com.example.appf1;

import android.os.Bundle;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

public class HomeNewsCrypto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home_crypto);

        // <-- Cambia el color de la navigation bar (inicio) -->
        Window window = this.getWindow();
        window.setNavigationBarColor(this.getResources().getColor(R.color.colorGradientEnd));
        // <-- Cambia el color de la navigation bar (fin) -->

    }
}