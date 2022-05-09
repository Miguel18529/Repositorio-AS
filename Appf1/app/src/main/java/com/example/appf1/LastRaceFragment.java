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

public class LastRaceFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.lastrace_activity, container, false);

        List<LastRace> lastRace = new ArrayList<>();
        lastRace.add(new LastRace("1º", "#47C3E0", "Alex ", "ALBON ", "Williams", "25 PTS", R.drawable.williams));
        lastRace.add(new LastRace("2º", "#41A8E0", "Fernando ", "ALONSO ", "Alpine", "18 PTS", R.drawable.alpine));
        lastRace.add(new LastRace("3º", "#D64964", "Valtteri ", "BOTTAS ", "Alfa Romeo","15 PTS", R.drawable.alfaromeo));
        lastRace.add(new LastRace("4º", "#6D99B2", "Pierre ", "GASLY ", "AlphaTauri","12 PTS", R.drawable.alphatauri));
        lastRace.add(new LastRace("5º", "#71D4C1", "Lewis ", "HAMILTON ", "Mercedes","10 PTS", R.drawable.mercedes));
        lastRace.add(new LastRace("6º", "#47C3E0", "Nicholas ", "LATIFI ", "Williams","8 PTS", R.drawable.williams));
        lastRace.add(new LastRace("7º", "#FA2948", "Charles ", "LECLERC ", "Ferrari","6 PTS", R.drawable.ferrari));
        lastRace.add(new LastRace("8º", "#BCB6AE", "Kevin ", "MAGNUSSEN ", "Haas F1 Team","4 PTS", R.drawable.haas));
        lastRace.add(new LastRace("9º", "#F68A32", "Lando ", "NORRIS ", "McLaren","2 PTS", R.drawable.mclaren));
        lastRace.add(new LastRace("10º", "#41A8E0", "Esteban ", "OCON ", "Alpine","1 PT", R.drawable.alpine));
        lastRace.add(new LastRace("11º", "#609CD4", "Sergio ", "PÉREZ ", "Red Bull Racing","0 PTS", R.drawable.redbull));
        lastRace.add(new LastRace("12º", "#F68A32", "Daniel ", "RICCIARDO ", "McLaren","0 PTS", R.drawable.mclaren));
        lastRace.add(new LastRace("13º", "#71D4C1", "George ", "RUSSELL ", "Mercedes","0 PTS", R.drawable.mercedes));
        lastRace.add(new LastRace("14º", "#FA2948", "Carlos ", "SAINZ ", "Ferrari","0 PTS", R.drawable.ferrari));
        lastRace.add(new LastRace("15º", "#BCB6AE", "Mick ", "SCHUMACHER ", "Haas F1 Team","0 PTS", R.drawable.haas));
        lastRace.add(new LastRace("16º", "#78CCB6", "Lance ", "STROLL ", "Aston Martin","0 PTS", R.drawable.astonmartin));
        lastRace.add(new LastRace("17º", "#6D99B2", "Yuki ", "TSUNODA ", "AlphaTauri","0 PTS", R.drawable.alphatauri));
        lastRace.add(new LastRace("DNF", "#609CD4", "Max ", "VERSTAPPEN ", "Red Bull Racing","0 PTS", R.drawable.redbull));
        lastRace.add(new LastRace("DNS", "#78CCB6", "Sebastian ", "VETTEL ", "Aston Martin","0 PTS", R.drawable.astonmartin));
        lastRace.add(new LastRace("20º", "#D64964", "Guanyu ", "ZHOU ", "Alfa Romeo","0 PTS", R.drawable.alfaromeo));

        LastRaceAdapter lastRaceAdapter = new LastRaceAdapter(lastRace, getContext());
        RecyclerView recyclerView = v.findViewById(R.id.listLastRaceRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(lastRaceAdapter);

        return v;
    }
}