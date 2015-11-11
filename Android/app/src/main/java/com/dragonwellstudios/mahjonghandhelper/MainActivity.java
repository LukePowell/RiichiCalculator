/*
 *  Copyright (c) 2015.
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 */
package com.dragonwellstudios.mahjonghandhelper;


import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.dragonwellstudios.mahjonghandhelper.riichi.CalculatorFragment;
import com.dragonwellstudios.mahjonghandhelper.riichi.fragments.YakuFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Bind(R.id.navigation_drawer)
    NavigationView navigationView;
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //Prevent overlapping fragments
        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.content,new YakuFragment()).commit();
        }

        navigationView.setNavigationItemSelectedListener(this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            new CalculatorFragment().show(getSupportFragmentManager(), "score_calculator");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //region NAVIGATION ----------------------------------------------------------------------------
    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        menuItem.setChecked(true);

        navigate(menuItem.getItemId());

        drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }


    void navigate(@IdRes int id){
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment;

        switch (id){
            case R.id.navigation_score_hand:
                fragment = new MainActivityFragment();
                break;
            case R.id.navigation_yaku_list:
                fragment = new YakuFragment();
                break;
            default:
                fragment = new BlankFragment();
                break;
        }

        manager.beginTransaction().replace(R.id.content, fragment).commit();
    }
    //endregion
}
