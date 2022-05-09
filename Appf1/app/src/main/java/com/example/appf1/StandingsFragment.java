package com.example.appf1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class StandingsFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed);

        TabLayout tabLayout = findViewById(R.id.tabLayoutStandings);
        ViewPager viewPager = findViewById(R.id.viewpagerStandings);

        tabLayout.setupWithViewPager(viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),
                FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPagerAdapter.addFragment(new DriversFragment(), "Drivers");
        viewPagerAdapter.addFragment(new ConstructorsFragment(), "Constructors");
        viewPagerAdapter.addFragment(new LastRaceFragment(), "Last Race");
        viewPager.setAdapter(viewPagerAdapter);

    }

}