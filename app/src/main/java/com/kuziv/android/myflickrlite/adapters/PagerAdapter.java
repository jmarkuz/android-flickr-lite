package com.kuziv.android.myflickrlite.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.kuziv.android.myflickrlite.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kuziv on 2/28/2016.
 */
public class PagerAdapter extends FragmentPagerAdapter {

    public static final int PAGE_COUNT = 5;

    public static final int PAGE_SEARCH = 0;
    public static final int PAGE_RECOMMEND = 1;
    public static final int PAGE_PROFILE = 2;
    public static final int PAGE_NOTIFICATION = 3;
    public static final int PAGE_CAMERA = 4;

    private List<Fragment> fragmentList = new ArrayList<>(PAGE_COUNT);

    public static int[] iconsIDs = new int[]{
            R.drawable.ic_search_white_24dp,
            R.drawable.ic_collections_white_24dp,
            R.drawable.ic_account_circle_white_24dp,
            R.drawable.ic_notifications_white_24dp,
            R.drawable.ic_camera_white_24dp
    };

    public PagerAdapter( FragmentManager fm ) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment pageFragment = null;

        switch (position) {
            case PAGE_SEARCH:
                pageFragment = fragmentList.get(PAGE_SEARCH);
                break;
            case PAGE_RECOMMEND:
                pageFragment = fragmentList.get(PAGE_RECOMMEND);
                break;
            case PAGE_PROFILE:
                pageFragment = fragmentList.get(PAGE_PROFILE);
                break;
            case PAGE_NOTIFICATION:
                pageFragment = fragmentList.get(PAGE_NOTIFICATION);
                break;
            case PAGE_CAMERA:
                pageFragment = fragmentList.get(PAGE_CAMERA);
                break;
        }
        return pageFragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }

    public void addFragment(Fragment fragment) {
        fragmentList.add(fragment);
    }

}
