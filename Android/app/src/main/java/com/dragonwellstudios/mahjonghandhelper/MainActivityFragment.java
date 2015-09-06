package com.dragonwellstudios.mahjonghandhelper;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dragonwellstudios.mahjonghandhelper.riichi.Yaku;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.InputStreamReader;

import butterknife.ButterKnife;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this,root);
        return root;
    }

    @Override
    public void onStart() {
        super.onStart();

        /*GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        Yaku[] yaku = gson.fromJson(new InputStreamReader(getResources().openRawResource(R.raw.yaku)),Yaku[].class);*/
    }
}
