package com.example.bankyx;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAdapter extends FragmentPagerAdapter {
    private static final int NUM_TABS = 5;



    public TabsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public TabsAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return HomeFragment.newInstance();
            case 1:
                return GraphFragment.newInstance();
            case 2:
                return HomeFragment.newInstance();
            case 3:
                return CardFragment.newInstance();
            case 5:
                return ProfileFragment.newInstance();
            default:
                return HomeFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return NUM_TABS;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0){
            return "Tab 1";
        }

        if (position == 1){
            return "Tab 2";
        }

        return "Tab 3";
    }
}
