package com.gmbdesign.main;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     * permite la transición y animación entre fragments
     */
    private ViewPager viewPager;

    /**
     * esta clase suministra los fragments
     */
    private MyPagerAdapter myPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.myViewPager);
        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(myPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.mipmap.ic_launcher_round);
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        if(viewPager.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            viewPager.setCurrentItem(viewPager.getCurrentItem() -1);
        }

    }
}
