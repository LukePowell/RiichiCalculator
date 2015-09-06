package com.dragonwellstudios.mahjonghandhelper.riichi.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dragonwellstudios.mahjonghandhelper.R;
import com.dragonwellstudios.mahjonghandhelper.riichi.Yaku;
import com.dragonwellstudios.mahjonghandhelper.riichi.adapters.YakuListAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.InputStreamReader;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class YakuFragment extends Fragment {

    //region VIEWS ---------------------------------------------------------------------------------
    @Bind(R.id.yaku_list)
    RecyclerView yakuList;
    //endregion

    private Yaku[] yaku;

    public YakuFragment() {
        // Required empty public constructor
    }

    //region LIFECYCLE -----------------------------------------------------------------------------
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_yaku, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        yaku = gson.fromJson(new InputStreamReader(getResources().openRawResource(R.raw.yaku)),Yaku[].class);

        yakuList.setLayoutManager(new LinearLayoutManager(getActivity()));
        yakuList.setAdapter(new YakuListAdapter(yaku));
    }
    //endregion
}
