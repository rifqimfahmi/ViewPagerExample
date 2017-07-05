package com.renotekno.zcabez.viewpagerexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by zcabez on 02/07/2017.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MondayFragment();
        } else if (position == 1){
            return new TuesdayFragment();
        } else if (position == 2) {
            return new WednesdayFragment();
        } else if (position == 3) {
            return new ThursdayFragment();
        } else {
            return new FridayFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Log.d("GetPageTitle", "getPageTitle() called");
        if (position == 0) {
            return "MONDAY";
        } else if (position == 1){
            return "TUESDAY";
        } else if (position == 2) {
            return "WEDNESDAY";
        } else if (position == 3) {
            return "THURSDAY";
        } else {
            return "FRIDAY";
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}