package com.example.appf1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SettingsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_settings, container, false);

        CardView cvtw = v.findViewById(R.id.cvtwitter);
        cvtw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse("https://twitter.com/F1");
                Intent intent = new Intent(Intent.ACTION_VIEW, link);
                startActivity(intent);
            }
        });

        CardView cvyt = v.findViewById(R.id.cvyoutube);
        cvyt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse("https://www.youtube.com/c/F1/videos");
                Intent intent = new Intent(Intent.ACTION_VIEW, link);
                startActivity(intent);
            }
        });

        CardView cvin = v.findViewById(R.id.cvinsta);
        cvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse("https://www.instagram.com/f1/");
                Intent intent = new Intent(Intent.ACTION_VIEW, link);
                startActivity(intent);
            }
        });

        CardView cvti = v.findViewById(R.id.cvtickets);
        cvti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse("https://tickets.formula1.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, link);
                startActivity(intent);
            }
        });

        CardView cvex = v.findViewById(R.id.cvexperiences);
        cvex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse("https://f1experiences.com/?utm_source=formula1.com&utm_medium=referral&utm_campaign=general");
                Intent intent = new Intent(Intent.ACTION_VIEW, link);
                startActivity(intent);
            }
        });

        CardView cvst = v.findViewById(R.id.cvstore);
        cvst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse("https://f1store.formula1.com/en/?_s=bm-fi-f1-prtsite-topnav-230720-jm");
                Intent intent = new Intent(Intent.ACTION_VIEW, link);
                startActivity(intent);
            }
        });

        CardView cves = v.findViewById(R.id.cvesports);
        cves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse("https://f1esports.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, link);
                startActivity(intent);
            }
        });

        CardView cvfa = v.findViewById(R.id.cvfantasy);
        cvfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse("https://fantasy.formula1.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, link);
                startActivity(intent);
            }
        });

        CardView cvpl = v.findViewById(R.id.cvplay);
        cvpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse("https://predictor.f1play.game/");
                Intent intent = new Intent(Intent.ACTION_VIEW, link);
                startActivity(intent);
            }
        });

        CardView cvho = v.findViewById(R.id.cvhospitality);
        cvho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse("https://tickets.formula1.com/en/h-formula1-hospitality");
                Intent intent = new Intent(Intent.ACTION_VIEW, link);
                startActivity(intent);
            }
        });

        CardView cvau = v.findViewById(R.id.cvauthentics);
        cvau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse("https://www.f1authentics.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW, link);
                startActivity(intent);
            }
        });

        CardView cvf1 = v.findViewById(R.id.cvf1);
        cvf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse("https://play.google.com/store/apps/details?id=com.softpauer.f1timingapp2014.basic");
                Intent intent = new Intent(Intent.ACTION_VIEW, link);
                startActivity(intent);
            }
        });

        CardView cvtv = v.findViewById(R.id.cvf1tv);
        cvtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse("https://play.google.com/store/apps/details?id=com.formulaone.production");
                Intent intent = new Intent(Intent.ACTION_VIEW, link);
                startActivity(intent);
            }
        });

        CardView cvrg = v.findViewById(R.id.cvraceguide);
        cvrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link = Uri.parse("https://play.google.com/store/apps/details?id=com.formula1.event");
                Intent intent = new Intent(Intent.ACTION_VIEW, link);
                startActivity(intent);
            }
        });

        return v;
    }
}