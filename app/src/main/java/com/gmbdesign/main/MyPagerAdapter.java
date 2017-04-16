package com.gmbdesign.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by ggamboa on 16/4/17.
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    /**
     * Constructor necesario para el PagerAdapter
     *
     * @param fm
     */
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Metodo sobreescrito necesario para suministrar los fragment al adapter
     *
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new ScreenFragmentUno();
                break;
            case 1:
                fragment = new ScreenFragmentDos();
                break;
        }

        return fragment;
    }

    /**
     * Metodo que me devuelve la cantidad de fragments a mostrar
     *
     * @return
     */
    @Override
    public int getCount() {
        return 2;
    }

    /**
     * Metodo sobreescrito que nos suministra un titulo al tab.
     *
     * @param position
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {

        //necesitamos este metdo para mostrar el titulo en el tab

        if (position == 0) {
            return "OPCION 1";
        } else {
            return "OPCION 2";
        }
    }
}
