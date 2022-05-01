package com.example.prueba_scrapping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;


public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        boton = findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verWeb();
            }
        });

    }


    public void verWeb(){
        new Thread(new Runnable() {

            @Override
            public void run() {
                final StringBuilder c = new StringBuilder();

                try  {
                    String url = "https://www.formula1.com";
                    Document doc = Jsoup.connect(url + "/en/drivers.html").get();
                    System.out.println("Buscando en el html..." + doc.title());
                    Elements content = doc.getElementsByClass("f1-black--xxl no-margin");
                    c.append(content.text());

                    Elements links = doc.select("a[href]");
                    System.out.println(links.size());
                    for (int i = 0; i < links.size(); i++){
                        String link = links.get(i).getElementsByClass("listing-item--link ").attr("href");
                        Document doc_aux = Jsoup.connect(url + link).get();
                        System.out.println(doc_aux.getElementsByClass("stat-list").text());

                    }

                    System.out.println("Finalizado");

                } catch (Exception e) {
                    System.out.println("Esto es muy poco guayando por tu parte:( " + e);
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tv.setText(c.toString());
                    }
                });
            }
        }).start();


    }
}