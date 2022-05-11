package com.example.prueba_scrapping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.SyncStatusObserver;
import android.database.sqlite.SQLiteDatabase;
import android.icu.lang.UScript;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.example.prueba_scrapping.BaseDatos;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    TextView tv, donete;
    Button boton;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);

        boton = findViewById(R.id.button);
        imagen = findViewById(R.id.imageView);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verWeb();
            }
        });
    }

    public void accesoBD(Map<String, Map<String, String>> valores){
        BaseDatos dbHelper = new BaseDatos(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        if(db!= null){
            List<String> keys = valores.keySet().stream().collect(Collectors.toList());
            for(int i = 0; i<valores.size(); i++){
                String query = String.valueOf("INSERT INTO") + String.valueOf(" drivers(possitionSeason, color, name, surname, team, pointsSeason, country, podiums, points, grand_prix_entered," +
                        " world_championships, highest_race_finish, highest_grid_position, date_of_birth, place_of_birth) VALUES (");

                query = query + "'" + valores.get(keys.get(i)).get("Positionseason") + "'" + String.valueOf(',');
                query = query + "'" + valores.get(keys.get(i)).get("Color") + "'" + String.valueOf(',');
                query = query + "'" + keys.get(i).split(" ")[0] + "'" + String.valueOf(',');
                query = query + "'" + keys.get(i).split(" ")[1] + "'" + String.valueOf(',');
                query = query + "'" + valores.get(keys.get(i)).get("Team") + "'" + String.valueOf(',');
                query = query + "'" + valores.get(keys.get(i)).get("pointsSeason") + "'" + String.valueOf(',');
                query = query + "'" + valores.get(keys.get(i)).get("Country") + "'" + String.valueOf(',');
                query = query + "'" + valores.get(keys.get(i)).get("Podiums") + "'" + String.valueOf(',');
                query = query + "'" + valores.get(keys.get(i)).get("Points") + "'" + String.valueOf(',');
                query = query + "'" + valores.get(keys.get(i)).get("Grands Prix entered") + "'" + String.valueOf(',');
                query = query + "'" + valores.get(keys.get(i)).get("World Championships") + "'" + String.valueOf(',');
                query = query + "'" + valores.get(keys.get(i)).get("Highest race finish") + "'" + String.valueOf(',');
                query = query + "'" + valores.get(keys.get(i)).get("Highest grid position") + "'" + String.valueOf(',');
                query = query + "'" + valores.get(keys.get(i)).get("Date of birth") + "'" + String.valueOf(',');
                query = query + "'" + valores.get(keys.get(i)).get("Place of birth") + "'" + String.valueOf(')');


                System.out.println(query);

                db.execSQL(query);

            }
        }
    }

    public Boolean contieneIndice(int index, List<String> lista){
        Boolean res = true;
        try{
            String elem = lista.get(index);
        }catch (Exception e){
            res = false;
        }
        return res;
    }
    public void verWeb(){
        new Thread(new Runnable() {

            @Override
            public void run() {
                final StringBuilder c = new StringBuilder();

                //Estructura: Nombre del piloto -> (Team: Ferrari, Country: Monaco .....)
                Map<String, Map<String, String>> valores = new HashMap<>();

                try  {
                    String url = "https://www.formula1.com";
                    Document doc = Jsoup.connect(url + "/en/drivers.html").get();
                    System.out.println("Buscando en el html... " + doc.title());
                    Elements content = doc.getElementsByClass("f1-black--xxl no-margin");
                    c.append(content.text());

                    Elements links = doc.select("a[href]");
                    int positionSeason = 1;

                    for (int i = 0; i < links.size(); i++){
                        String link = links.get(i).getElementsByClass("listing-item--link ").attr("href");

                        Document doc_aux = Jsoup.connect(url + link).get();
                        String el = doc_aux.getElementsByClass("stat-list").text();
                        //System.out.println(el);
                        String[] el_split = el.split(" ");
                        List<String> el_list = new ArrayList<>();
                        for (int j = 0; j < el_split.length; j++){
                            el_list.add(el_split[j]);
                        }


                        //Obtener k, key = nombre del piloto --> Fino señores
                        String K_driver_name = doc_aux.getElementsByClass("driver-name").text();
                        //System.out.println("Nombre: " + K_driver_name);

                        //Obtener v, value = Map (Team: Ferrari, Country: Monaco .....)
                        Map<String, String> v = new HashMap<>();

                        //Team y PositionSeason
                        if(el_list.get(0).equals("Team")){
                            int j = 1;
                            String v_aux = "";
                            while(!el_list.get(j).equals("Country")){
                                v_aux = v_aux + " " + el_split[j];
                                j++;
                                v_aux = v_aux.replaceFirst(" ",  "");
                            }
                            v.put(el_list.get(0), v_aux);
                            v.put("Positionseason", String.valueOf(positionSeason));
                            positionSeason++;
                        }



                        //Color
                        String color = links.get(i).getElementsByClass("listing-item--link ").attr("style");
                        if(!color.equals(null)){
                            v.put("Color", color.replace("color:", ""));
                        }

                        //Country
                        int indice = el_list.indexOf("Country");
                        int j = indice+1;

                        if(indice!=-1){
                            String aux_count = "";
                            while(!el_list.get(j).equals("Podiums")){
                                aux_count = aux_count + " " + el_list.get(j);
                                j++;
                            }
                            aux_count = aux_count.replaceFirst(" ", "");
                            v.put(el_list.get(indice), aux_count);
                        }

                        //Podiums
                        int indice_p = el_list.indexOf("Podiums");
                        if(indice_p != -1){
                            v.put(el_list.get(indice_p), el_list.get(indice_p+1));
                        }

                        if(K_driver_name.split(" ").length<=2){
                            valores.put(K_driver_name, v);
                        }

                        //Points
                        int indicePuntos = el_list.indexOf("Points");
                        if(indicePuntos != -1){
                            v.put(el_list.get(indicePuntos), el_list.get(indicePuntos + 1));
                        }

                        //Grand prix entered
                        int indiceGPE = el_list.indexOf("entered");
                        if(indiceGPE != -1){
                            v.put("Grands Prix entered", el_list.get(indiceGPE+1));
                        }

                        //World Championships
                        int indiceWC = el_list.indexOf("Championships");
                        if(indiceWC != -1){
                            v.put("World Championships", el_list.get(indiceWC+1));
                        }

                        //Highest race finish
                        int indiceHRF = el_list.indexOf("finish");
                        if(indiceHRF != -1){
                            v.put("Highest race finish", el_list.get(indiceHRF+1));
                        }

                        //Highest grid position
                        int indiceHGP = el_list.indexOf("position");
                        if(indiceHGP != -1){
                            v.put("Highest grid position", el_list.get(indiceHGP+1));
                        }

                        //Date of birth
                        int indiceDOB = el_list.indexOf("Date");
                        if(indiceDOB != -1){
                            v.put("Date of birth", el_list.get(indiceDOB+3));
                        }

                        //Place of birth
                        int indicePOB = el_list.indexOf("Place");
                        if(indicePOB != -1){
                            String aux_POB = "";
                            while (contieneIndice(indicePOB+3, el_list)) {
                                aux_POB = aux_POB + " " + el_list.get(indicePOB+3);
                                indicePOB++;
                            }
                            aux_POB = aux_POB.replaceFirst(" ", "").replace("'", "");
                            v.put("Place of birth", aux_POB);
                        }

                        //pointsSeason
                        Document doc2 = Jsoup.connect(url + "/en/results.html/2022/drivers.html").get();
                        List<String> equip = doc2.getElementsByClass("hide-for-mobile").stream().map(x -> x.text()).collect(Collectors.toList());
                        List<String> pts = doc2.getElementsByClass("dark bold").stream().map(x -> x.text()).collect(Collectors.toList());


                        for (int k = 0; k < equip.size(); k++){
                            if(K_driver_name.contains(equip.get(k))){
                                v.put("pointsSeason", pts.get(k));
                            }
                        }

                    }

                    if(valores.containsKey("")){
                        valores.remove("");
                    }
                    /* ver el map entrada a entrada
                    for(String name: valores.keySet()){
                        System.out.println("aham: " + name + ": " + valores.get(name));
                    }*/

                    System.out.println("res: " + valores);
                    System.out.println(valores.size());
                    System.out.println("Finalizado");

                } catch (Exception e) {
                    System.out.println("Esto es muy poco guayando por tu parte:( " + e);
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tv.setText(c.toString());
                        accesoBD(valores);
                        System.out.println("Guayando");
                    }
                });
            }
        }).start();


    }
}