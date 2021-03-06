package com.afpsoft.tabbar2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alipi on 27.02.2018.
 */

public class SectionsPageAdapter  extends FragmentPagerAdapter{

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList= new ArrayList<>();

    public void addFragment(Fragment fragment, String title){

        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }

    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);

    }

    @Override
    public int getCount() {
        return mFragmentList.size();

    }
}
