package com.kuziv.android.myflickrlite;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kuziv.android.myflickrlite.adapters.ImageAdapter;
import com.kuziv.android.myflickrlite.adapters.PagerAdapter;
import com.kuziv.android.myflickrlite.fragments.CameraFragment;
import com.kuziv.android.myflickrlite.fragments.MyProfileFragment;
import com.kuziv.android.myflickrlite.fragments.NotificationsFragment;
import com.kuziv.android.myflickrlite.fragments.RecommendFragment;
import com.kuziv.android.myflickrlite.fragments.SearchFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons(tabLayout);

    }

    private void setupViewPager(ViewPager viewPager) {
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SearchFragment());
        adapter.addFragment(new RecommendFragment());
        adapter.addFragment(new MyProfileFragment());
        adapter.addFragment(new NotificationsFragment());
        adapter.addFragment(new CameraFragment());
        viewPager.setAdapter(adapter);
    }

    //TODO change indexes
    private void setupTabIcons(TabLayout tabLayout) {
        tabLayout.getTabAt(0).setIcon(PagerAdapter.iconsIDs[0]);
        tabLayout.getTabAt(1).setIcon(PagerAdapter.iconsIDs[1]);
        tabLayout.getTabAt(2).setIcon(PagerAdapter.iconsIDs[2]);
        tabLayout.getTabAt(3).setIcon(PagerAdapter.iconsIDs[3]);
        tabLayout.getTabAt(4).setIcon(PagerAdapter.iconsIDs[4]);
    }

}
