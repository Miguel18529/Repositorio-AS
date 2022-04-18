package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner sp1;
    private EditText v1;
    private EditText v2;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1 = (EditText) findViewById(R.id.editTextNumber);
        v2 = (EditText) findViewById(R.id.editTextNumber2);
        res = (TextView) findViewById(R.id.textView);
        sp1 = (Spinner) findViewById(R.id.spinner);

        String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opciones);

        sp1.setAdapter(adapter);
    }

    public void calculo(View view){

        String v1S = v1.getText().toString();
        String v2S = v2.getText().toString();
        int v1I = Integer.parseInt(v1S);
        int v2I = Integer.parseInt(v2S);

        String seleccion = sp1.getSelectedItem().toString();
        String resu = "";
        if(seleccion.equals("Sumar")){
            int suma = v1I + v2I;
            String sumaS = String.valueOf(suma);
            resu = "La suma es: " + sumaS;
            res.setText(resu);
        }

        if(seleccion.equals("Restar")){
            int resta = v1I - v2I;
            String restaS = String.valueOf(resta);
            resu = "La resta es: " + restaS;
            res.setText(resu);
        }

        if(seleccion.equals("Multiplicar")){
            int mult = v1I * v2I;
            String multS = String.valueOf(mult);
            resu = "La multiplicación es: " + multS;
            res.setText(resu);
        }

        if(seleccion.equals("Dividir")){
            if(v2I!= 0){
                float div = (float) v1I / v2I;
                String divS = String.valueOf(div);
                resu = "La división es: " + divS;
                res.setText(resu);
            } else{
                Toast.makeText(this, "No se puede dividir por 0", Toast.LENGTH_SHORT).show();

            }

        }

    }
}