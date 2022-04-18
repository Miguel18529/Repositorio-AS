package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.text.TextRunShaper;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText v1;
    private EditText v2;
    private TextView res;
    private CheckBox s, r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v1 = (EditText) findViewById(R.id.editTextTextPersonName);
        v2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        res = (TextView) findViewById(R.id.textView);
        s = (CheckBox) findViewById(R.id.checkBox);
        r = (CheckBox) findViewById(R.id.checkBox2);
    }

    public void Calcular(View view){
        String valor1 = v1.getText().toString();
        String valor2 = v2.getText().toString();
        int v1Int = Integer.parseInt(valor1);
        int v2Int = Integer.parseInt(valor2);
        String resu = "";
        if (s.isChecked()){
            int suma = v1Int + v2Int;
            String sumaS = String.valueOf(suma);
            if(r.isChecked()){
                int resta = v1Int - v2Int;
                String restaS = String.valueOf(resta);
                resu = "La suma es: " + sumaS + "/ La resta es: " + restaS;
                res.setText(resu);
            } else{
                resu = "La suma es: " + sumaS;
                res.setText(resu);
            }
        } else{
            if (r.isChecked()){
                int resta = v1Int - v2Int;
                String restaS = String.valueOf(resta);
                resu = "La resta es: " + restaS;
                res.setText(resu);
            } else{
                resu = "Dale a algún checkbox";
                res.setText(resu);
            }
        }
    }
}