package com.example.prueba_scrapping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    Thread thread = new Thread(new Runnable() {
        private TextView tv;
        @Override
        public void run() {
            try  {
                tv = (TextView) findViewById(R.id.textView);
                Document doc = Jsoup.connect("https://www.formula1.com/en/drivers.html").get();
                System.out.println("Buscando en el html..." + doc.title());
                Elements content = doc.getElementsByClass("f1-black--xxl no-margin");
                String c = content.text();
                //TODO: Error al usar el tv, parece que al hilo no le gusta usar cosas externas
                tv.setText(c);
            } catch (Exception e) {
                System.out.println("Esto es muy poco guayando por tu parte:( " + e);
            }
        }
    });



    public void verWeb(View view){

        thread.start();


    }
}