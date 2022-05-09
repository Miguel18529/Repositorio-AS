package com.example.appf1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class CalendarFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.circuits_activity, container, false);

        List<Circuits> circuits = new ArrayList<>();
        circuits.add(new Circuits("Round 1", "Bahrain ", "FORMULA 1 GULF AIR BAHRAIN GRAND PRIX 2022", "2004", "57", "5.412 km", "308.238 km", "1:31.447 Pedro de la Rosa (2005)", "Bahrain International Circuit", R.drawable.flagbahrain, R.drawable.bahrein2));
        circuits.add(new Circuits("Round 2", "Saudi Arabia ", "FORMULA 1 STC SAUDI ARABIAN GRAND PRIX 2022", "2021", "50", "6.174 km", "308.45 km", "1:30.734 Lewis Hamilton (2021)", "Jeddah Corniche Circuit", R.drawable.flagsaudi, R.drawable.saudiarabia2));
        circuits.add(new Circuits("Round 3", "Australia ", "FORMULA 1 HEINEKEN AUSTRALIAN GRAND PRIX 2022", "1996", "58", "5.278 km", "306.124 km", "1:20.260 Charles Leclerc (2022)", "Albert Park Circuit", R.drawable.flagaustralia, R.drawable.australia2));
        circuits.add(new Circuits("Round 4", "Italy ", "FORMULA 1 ROLEX GRAN PREMIO DEL MADE IN ITALY E DELL'EMILIA-ROMAGNA 2022", "1980", "63", "4.909 km", "309.049 km", "1:15.484 Lewis Hamilton (2020)","Autodromo Enzo e Dino Ferrari", R.drawable.flagitaly, R.drawable.imola2));
        circuits.add(new Circuits("Round 5", "United States ", "FORMULA 1 CRYPTO.COM MIAMI GRAND PRIX 2022", "2022", "57", "5.412 km", "308.326 km", "null", "Miami International Autodrome", R.drawable.flagusa, R.drawable.miami2));
        circuits.add(new Circuits("Round 6", "Spain ", "FORMULA 1 PIRELLI GRAN PREMIO DE ESPAÑA 2022", "1991", "66", "4.675 km", "308.424 km", "1:18.149 Max Verstappen (2021)", "Circuit de Barcelona-Catalunya", R.drawable.flagspain, R.drawable.spain2));
        circuits.add(new Circuits("Round 7", "Monaco ", "FORMULA 1 GRAND PRIX DE MONACO 2022", "1950", "78", "3.337 km", "260.286 km", "1:12.909 Lewis Hamilton (2021)", "Circuit de Monaco", R.drawable.flagmonaco, R.drawable.monaco2));
        circuits.add(new Circuits("Round 8", "Azerbaijan ", "FORMULA 1 AZERBAIJAN GRAND PRIX 2022", "2016", "51", "6.003 km", "306.049 km", "1:43.009 Charles Leclerc (2019)", "Baku City Circuit", R.drawable.flagazerbaijan, R.drawable.baku2));
        circuits.add(new Circuits("Round 9", "Canada ", "FORMULA 1 GRAND PRIX DU CANADA 2022", "1978", "70", "4.361 km", "305.27 km", "1:13.078 Valtteri Bottas (2019)", "Circuit Gilles-Villeneuve", R.drawable.flagcanada, R.drawable.canada2));
        circuits.add(new Circuits("Round 10", "Great Britain ", "FORMULA 1 BRITISH GRAND PRIX 2022", "1950", "52", "5.891 km", "306.198 km", "1:27.097 Max Verstappen (2020)", "Silverstone Circuit", R.drawable.flaguk, R.drawable.silverstone2));
        circuits.add(new Circuits("Round 11", "Austria ", "FORMULA 1 GROSSER PREIS VON ÖSTERREICH 2022", "1970", "71", "4.318 km", "306.452 km", "1:05.619 Carlos Sainz (2020)", "Red Bull Ring", R.drawable.flagaustria, R.drawable.austria2));
        circuits.add(new Circuits("Round 12", "France ", "FORMULA 1 GRAND PRIX DE FRANCE 2022", "1971", "53", "5.842 km", "309.69 km", "1:32.740 Sebastian Vettel (2019)", "Circuit Paul Ricard", R.drawable.flagfrance, R.drawable.france2));
        circuits.add(new Circuits("Round 13", "Hungary ", "FORMULA 1 ARAMCO MAGYAR NAGYDÍJ 2022", "1986", "70", "4.381 km", "306.63 km", "1:16.627 Lewis Hamilton (2020)", "Hungaroring", R.drawable.flaghungary, R.drawable.hungary2));
        circuits.add(new Circuits("Round 14", "Belgium ", "FORMULA 1 ROLEX BELGIAN GRAND PRIX 2022", "1950", "44", "7.004 km", "308.052 km", "1:46.286 Valtteri Bottas (2018)", "Circuit de Spa-Francorchamps", R.drawable.flagbelgium, R.drawable.spa2));
        circuits.add(new Circuits("Round 15", "Netherlands ", "FORMULA 1 HEINEKEN DUTCH GRAND PRIX 2022", "1952", "72", "4.259 km", "306.587 km", "1:11.097 Lewis Hamilton (2021)", "Circuit Zandvoort", R.drawable.flagnetherlands, R.drawable.zandvoort2));
        circuits.add(new Circuits("Round 16", "Italy ", "FORMULA 1 PIRELLI GRAN PREMIO D'ITALIA 2022", "1950", "53", "5.793 km", "306.72 km", "1:21.046 Rubens Barrichello (2004)", "Autodromo Nazionale Monza", R.drawable.flagitaly, R.drawable.monza2));
        circuits.add(new Circuits("Round 17", "Singapore ", "FORMULA 1 SINGAPORE GRAND PRIX 2022", "2008", "61", "5.063 km", "308.706 km", "1:41.905 Kevin Magnussen (2018)", "Marina Bay Street Circuit", R.drawable.flagsingapore, R.drawable.singapore2));
        circuits.add(new Circuits("Round 18", "Japan ", "FORMULA 1 JAPANESE GRAND PRIX 2022", "1987", "53", "5.807 km", "307.471 km", "1:30.983 Lewis Hamilton (2019)", "Suzuka International Racing Course", R.drawable.flagjapan, R.drawable.suzuka2));
        circuits.add(new Circuits("Round 19", "United States ", "FORMULA 1 ARAMCO UNITED STATES GRAND PRIX 2022", "2012", "56", "5.513 km", "308.405 km", "1:36.169 Charles Leclerc (2019)", "Circuit of The Americas", R.drawable.flagusa, R.drawable.eeuu2));
        circuits.add(new Circuits("Round 20", "Mexico ", "FORMULA 1 GRAN PREMIO DE LA CIUDAD DE MÉXICO 2022", "1963", "71", "4.304 km", "305.354 km", "1:17.774 Valtteri Bottas (2021)", "Autódromo Hermanos Rodríguez", R.drawable.flagmexico, R.drawable.mexico2));
        circuits.add(new Circuits("Round 21", "Brazil ", "FORMULA 1 HEINEKEN GRANDE PRÊMIO DE SÃO PAULO 2022", "1973", "71", "4.309 km", "305.879 km", "1:10.540 Valtteri Bottas (2018)", "Autódromo José Carlos Pace", R.drawable.flagbrazil, R.drawable.brazil2));
        circuits.add(new Circuits("Round 22", "Abu Dhabi ", "FORMULA 1 ETIHAD AIRWAYS ABU DHABI GRAND PRIX 2022", "2009", "58", "5.281 km", "306.183 km", "1:26.103 Max Verstappen (2021)", "Yas Marina Circuit", R.drawable.flagabudhabi, R.drawable.abudhabi2));

        CircuitsAdapter circuitsAdapter = new CircuitsAdapter(circuits, getContext());
        RecyclerView recyclerView = v.findViewById(R.id.listCircuitsRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(circuitsAdapter);

        return v;
    }
}