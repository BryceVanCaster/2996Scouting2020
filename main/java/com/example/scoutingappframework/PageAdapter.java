package com.example.scoutingappframework;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.scoutingappframework.AutoTab;
import com.example.scoutingappframework.CoverTab;
import com.example.scoutingappframework.EndgameTab;
import com.example.scoutingappframework.TeleopTab;

public class PageAdapter extends FragmentPagerAdapter {

    private int numTabs;

    public PageAdapter(@NonNull FragmentManager fm, int numoftabs) {
        super(fm);
        this.numTabs = numoftabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CoverTab();
            case 1:
                return new AutoTab();
            case 2:
                return new TeleopTab();
            case 3:
                return new EndgameTab();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numTabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
