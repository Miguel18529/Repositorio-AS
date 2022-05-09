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

public class DriversFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.drivers_activity, container, false);

        List<Drivers> drivers = new ArrayList<>();
        drivers.add(new Drivers("18º", "#47C3E0", "Alex ", "ALBON ", "Williams", "1 PT", R.drawable.williams, R.drawable.flagthailand, R.drawable.albnumber, R.drawable.alb2, R.drawable.albhelmet, "Thailand", "2", "198", "42", "N/A", "3 (x2)", "4", "23/03/1996", "London, England"));
        drivers.add(new Drivers("1º", "#41A8E0", "Fernando ", "ALONSO ", "Alpine", "400 PTS", R.drawable.alpine, R.drawable.flagspain, R.drawable.alonumber, R.drawable.alo2, R.drawable.alohelmet, "Spain", "98", "1982", "340", "2", "1 (x32)", "1", "29/07/1981", "Oviedo, Spain"));
        drivers.add(new Drivers("9º", "#D64964", "Valtteri ", "BOTTAS ", "Alfa Romeo","28 PTS", R.drawable.alfaromeo, R.drawable.flagfinland, R.drawable.botnumber, R.drawable.bot2, R.drawable.bothelmet, "Finland", "67", "1762", "182", "N/A", "1 (x10)", "1", "28/08/1989", "Nastola, Finland"));
        drivers.add(new Drivers("20º", "#6D99B2", "Pierre ", "GASLY ", "AlphaTauri","0 PTS", R.drawable.alphatauri, R.drawable.flagfrance, R.drawable.gasnumber, R.drawable.gas2, R.drawable.gashelmet, "France", "3", "315", "90", "N/A", "1 (x1)", "2", "07/02/1996", "Rouen, France"));
        drivers.add(new Drivers("2º", "#71D4C1", "Lewis ", "HAMILTON ", "Mercedes","11 PTS", R.drawable.mercedes, R.drawable.flaguk, R.drawable.hamnumber, R.drawable.ham2, R.drawable.hamhelmet, "United Kingdom", "183", "4193.5", "292", "7", "1 (x103)", "1", "07/01/1985", "Stevenage, England"));
        drivers.add(new Drivers("3º", "#47C3E0", "Nicholas ", "LATIFI ", "Williams","22 PTS", R.drawable.williams, R.drawable.flagcanada, R.drawable.latnumber, R.drawable.lat2, R.drawable.lathelmet, "Canada", "N/A", "7", "43", "N/A", "7 (x1)", "10", "29/06/1995", "Montreal, Canada"));
        drivers.add(new Drivers("4º", "#FA2948", "Charles ", "LECLERC ", "Ferrari","16 PTS", R.drawable.ferrari, R.drawable.flagmonaco, R.drawable.lecnumber, R.drawable.lec2, R.drawable.lechelmet, "Monaco", "16", "646", "85", "N/A", "1 (x4)", "1", "16/10/1997", "Monte Carlo, Monaco"));
        drivers.add(new Drivers("5º", "#BCB6AE", "Kevin ", "MAGNUSSEN ", "Haas F1 Team","8 PTS", R.drawable.haas, R.drawable.flagdenmark, R.drawable.magnumber, R.drawable.mag2, R.drawable.maghelmet, "Denmark", "1", "173", "124", "N/A", "2 (x1)", "4", "05/10/1992", "Roskilde, Denmark"));
        drivers.add(new Drivers("6º", "#F68A32", "Lando ", "NORRIS ", "McLaren","10 PTS", R.drawable.mclaren, R.drawable.flaguk, R.drawable.nornumber, R.drawable.nor2, R.drawable.norhelmet, "United Kingdom", "6", "341", "64", "N/A", "2 (x1)", "1", "13/11/1999", "Bristol, England"));
        drivers.add(new Drivers("7º", "#41A8E0", "Esteban ", "OCON ", "Alpine","42 PTS", R.drawable.alpine, R.drawable.flagfrance, R.drawable.oconumber, R.drawable.oco2, R.drawable.ocohelmet, "France", "2", "292", "93", "N/A", "1 (x1)", "3", "17/09/1996", "Évreux, Normandy"));
        drivers.add(new Drivers("8º", "#609CD4", "Sergio ", "PÉREZ ", "Red Bull Racing","113 PTS", R.drawable.redbull, R.drawable.flagmexico, R.drawable.pernumber, R.drawable.per2, R.drawable.perhelmet, "Mexico", "17", "950", "218", "N/A", "1 (x2)", "1", "26/01/1990", "Guadalajara, Mexico"));
        drivers.add(new Drivers("10º", "#F68A32", "Daniel ", "RICCIARDO ", "McLaren","86 PTS", R.drawable.mclaren, R.drawable.flagaustralia, R.drawable.ricnumber, R.drawable.ric2, R.drawable.richelmet, "Australia", "32", "1285", "214", "N/A", "1 (x8)", "1", "01/07/1989", "Perth, Australia"));
        drivers.add(new Drivers("11º", "#71D4C1", "George ", "RUSSELL ", "Mercedes","79 PTS", R.drawable.mercedes, R.drawable.flaguk, R.drawable.rusnumber, R.drawable.rus2, R.drawable.rushelmet, "United Kingdom", "2", "68", "64", "N/A", "2 (x1)", "2", "15/02/1998", "King's Lynn, England"));
        drivers.add(new Drivers("12º", "#FA2948", "Carlos ", "SAINZ ", "Ferrari","45 PTS", R.drawable.ferrari, R.drawable.flagspain, R.drawable.sainumber, R.drawable.sai2, R.drawable.saihelmet, "Spain", "8", "574.5", "145", "N/A", "2 (x3)", "2", "01/09/1994", "Madrid, Spain"));
        drivers.add(new Drivers("13º", "#BCB6AE", "Mick ", "SCHUMACHER ", "Haas F1 Team","30 PTS", R.drawable.haas, R.drawable.flaggermany, R.drawable.schnumber, R.drawable.sch2, R.drawable.schhelmet, "Germany", "N/A", "0", "25", "N/A", "11 (x1)", "10", "22/03/1999", "Vufflens-le-Château, Switzerland"));
        drivers.add(new Drivers("14º", "#78CCB6", "Lance ", "STROLL ", "Aston Martin","2 PTS", R.drawable.astonmartin, R.drawable.flagcanada, R.drawable.strnumber, R.drawable.str2, R.drawable.strhelmet, "Canada", "3", "177", "104", "N/A", "3 (x3)", "1", "29/10/1998", "Montreal, Canada"));
        drivers.add(new Drivers("15º", "#6D99B2", "Yuki ", "TSUNODA ", "AlphaTauri","41 PTS", R.drawable.alphatauri, R.drawable.flagjapan, R.drawable.tsunumber, R.drawable.tsu2, R.drawable.tsuhelmet, "Japan", "N/A", "42", "26", "N/A", "4 (x1)", "7", "11/05/2000", "Sagamihara, Japan"));
        drivers.add(new Drivers("16º", "#609CD4", "Max ", "VERSTAPPEN ", "Red Bull Racing","67 PTS", R.drawable.redbull, R.drawable.flagnetherlands, R.drawable.vernumber, R.drawable.ver2, R.drawable.verhelmet, "Netherlands", "62", "1616.5", "145", "1", "1 (x22)", "1", "30/09/1997", "Hasselt, Belgium"));
        drivers.add(new Drivers("17º", "#78CCB6", "Sebastian ", "VETTEL ", "Aston Martin","94 PTS", R.drawable.astonmartin, R.drawable.flaggermany, R.drawable.vetnumber, R.drawable.vet2, R.drawable.vethelmet, "Germany", "122", "3065", "282", "4", "1 (x53)", "1", "03/07/1987", "Heppenheim, Germany"));
        drivers.add(new Drivers("19º", "#D64964", "Guanyu ", "ZHOU ", "Alfa Romeo","25 PTS", R.drawable.alfaromeo, R.drawable.flagchina, R.drawable.zhonumber, R.drawable.zho2, R.drawable.zhohelmet, "China", "N/A", "1", "4", "N/A", "10 (x1)", "12", "30/05/1999", "Shanghai, China"));

        DriversAdapter driversAdapter = new DriversAdapter(drivers, getContext());
        RecyclerView recyclerView = v.findViewById(R.id.listDriversRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(driversAdapter);

        return v;

    }
}