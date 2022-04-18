package com.example.miprimeraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText primer_valor;
    private EditText segundo_valor;
    private TextView resultado;
    private RadioButton r1, r2, r3, r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primer_valor = (EditText) findViewById(R.id.txt_primer_valor);
        segundo_valor = (EditText) findViewById(R.id.txt_segundo_valor);
        resultado = (TextView) findViewById(R.id.textView);
        r1 = (RadioButton) findViewById(R.id.radioButton1);
        r2 = (RadioButton) findViewById(R.id.radioButton2);
        r3 = (RadioButton) findViewById(R.id.radioButton3);
        r4 = (RadioButton) findViewById(R.id.radioButton4);
    }

    public void calcular(View view){
        String primer_valor_string = primer_valor.getText().toString();
        String segundo_valor_string = segundo_valor.getText().toString();
        int primer_valor_int = Integer.parseInt(primer_valor_string);
        int segundo_valor_int = Integer.parseInt(segundo_valor_string);
        if (r1.isChecked()){
            int suma = primer_valor_int + segundo_valor_int;
            String res = String.valueOf(suma);
            resultado.setText(res);
        } else if(r2.isChecked()){
            int resta = primer_valor_int - segundo_valor_int;
            String res = String.valueOf(resta);
            resultado.setText(res);
        } else if(r3.isChecked()){
            int mult = primer_valor_int * segundo_valor_int;
            String res = String.valueOf(mult);
            resultado.setText(res);

        } else if (r4.isChecked()){
            if (segundo_valor_int != 0){
                int div = primer_valor_int / segundo_valor_int;
                String res = String.valueOf(div);
                resultado.setText(res);
            } else{
                Toast.makeText(this, "No se puede dividir por 0", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "Selecciona una operación", Toast.LENGTH_SHORT).show();
        }
    }


}