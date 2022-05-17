package com.example.appf1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class StandingsViewPagerAdapter extends FragmentStatePagerAdapter {

    public StandingsViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new DriversFragment();
            case 1:
                return new ConstructorsFragment();
            case 2:
                return new LastRaceFragment();
            default:
                return new DriversFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Drivers";
            case 1:
                return "Constructors";
            case 2:
                return "Last Race";
            default:
                return "Drivers";
        }
    }
}
