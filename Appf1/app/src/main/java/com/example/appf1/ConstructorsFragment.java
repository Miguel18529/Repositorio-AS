package com.example.appf1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ConstructorsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.constructors_activity, container, false);

        List<Constructors> constructors = new ArrayList<>();
        constructors.add(new Constructors("1º", "#FA2948", "FERRARI ", "C.Leclerc / C.Sainz", "125 PTS", "Scuderia Ferrari", "Maranello, Italy", "Mattia Binotto", "Enrico Cardile / Enrico Gualtieri", "F1-75", "Ferrari", "1950", "16", "1 (x241)", "232", "256", R.drawable.ferrari, R.drawable.ferraricar));
        constructors.add(new Constructors("2º", "#609CD4", "RED BULL ", "M.Verstappen / S.Pérez", "79 PTS", "Oracle Red Bull Racing", "Milton Keynes, United Kingdom", "Christian Horner", "Pierre Waché", "RB18", "Red Bull Powertrains", "1997", "4", "1 (x77)", "75", "77", R.drawable.redbull, R.drawable.redbullcar));
        constructors.add(new Constructors("3º", "#71D4C1", "MERCEDES ", "L.Hamilton / G.Russell", "68 PTS", "Mercedes-AMG Petronas F1 Team", "Brackley, United Kingdom", "Toto Wolff", "Mike Elliott", "W13", "Mercedes", "1970", "8", "1 (x115)", "127", "85", R.drawable.mercedes, R.drawable.mercedescar));
        constructors.add(new Constructors("4º", "#F68A32", "MCLAREN ", "L.Norris / D.Ricciardo", "50 PTS", "McLaren F1 Team", "Woking, United Kingdom", "Andreas Seidl", "James Key", "MCL36", "Mercedes", "1966", "8", "1 (x183)", "156", "160", R.drawable.mclaren, R.drawable.mclarencar));
        constructors.add(new Constructors("5º", "#41A8E0", "ALPINE ", "F.Alonso / E.Ocon", "48 PTS", "BWT Alpine F1 Team", "Enstone, United Kingdom", "Otmar Szafnauer", "Pat Fry", "A522", "Renault", "1986", "2", "1 (x21)", "20", "15", R.drawable.alpine, R.drawable.alpinecar));
        constructors.add(new Constructors("6º", "#D64964", "ALFA ROMEO ", "V.Bottas / G.Zhou", "29 PTS", "Alfa Romeo F1 Team ORLEN", "Hinwil, Switzerland", "Frédéric Vasseur", "Jan Monchaux", "C42", "Ferrari", "1993", "N/A", "1 (x1)", "1", "5", R.drawable.alfaromeo, R.drawable.alfaromeocar));
        constructors.add(new Constructors("7º", "#BCB6AE", "HAAS ", "M.Schumacher / K.Magnussen", "13 PTS", "Haas F1 Team", "Kannapolis, United States", "Guenther Steiner", "Simone Resta", "VF-22", "Ferrari", "2016", "N/A", "4 (x1)", "N/A", "2", R.drawable.haas, R.drawable.haascar));
        constructors.add(new Constructors("8º", "#6D99B2", "ALPHATAURI ", "P.Gasly / Y.Tsunoda", "12 PTS", "Scuderia AlphaTauri", "Faenza, Italy", "Franz Tost", "Jody Egginton", "AT03", "Red Bull Powertrains", "1985", "N/A", "1 (x2)", "1", "2", R.drawable.alphatauri, R.drawable.alphatauricar));
        constructors.add(new Constructors("9º", "#47C3E0", "WILLIAMS ", "N.Latifi / A.Albon", "5 PTS", "Williams Racing", "Grove, United Kingdom", "Jost Capito", "François-Xavier Demaison", "FW44", "Mercedes", "1978", "9", "1 (x114)", "128", "133", R.drawable.williams, R.drawable.williamscar));
        constructors.add(new Constructors("10º", "#78CCB6", "ASTON MARTIN ", "S.Vettel / L.Stroll", "1 PT", "Aston Martin Aramco Cognizant F1 Team", "Silverstone, United Kingdom", "Mike Krack", "Andrew Green", "AMR22", "Mercedes", "2018", "N/A", "1 (x1)", "1", "N/A", R.drawable.astonmartin, R.drawable.astonmartincar));

        ConstructorsAdapter constructorsAdapter = new ConstructorsAdapter(constructors, getContext());
        RecyclerView recyclerView = v.findViewById(R.id.listConstructorsRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(constructorsAdapter);

        return v;
    }
}