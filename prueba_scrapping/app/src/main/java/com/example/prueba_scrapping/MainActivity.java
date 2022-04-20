package com.example.prueba_scrapping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

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

    public void verWeb(View view){
        try{
            Document doc = Jsoup.connect("https://www.formula1.com/en.html").get();
            System.out.println("Buscando en el html..." + doc.title());
            Elements content = doc.getElementsByTag("body");
            System.out.println(content.size());
            for(int i = 0; i < content.size(); i++){
                System.out.println(content.get(i).toString());
            }

            System.out.println("Finalizado");
        } catch(Exception e){
            System.out.println(e);
        }

    }
}