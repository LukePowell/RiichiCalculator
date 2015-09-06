package com.dragonwellstudios.mahjonghandhelper.riichi.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dragonwellstudios.mahjonghandhelper.R;
import com.dragonwellstudios.mahjonghandhelper.riichi.Yaku;

/**
 * Created by Luke Powell on 9/6/2015.
 */
public class YakuListAdapter extends RecyclerView.Adapter<YakuViewHolder> {
    Yaku[] yaku;

    public YakuListAdapter(Yaku[] yaku) {
        this.yaku = yaku;
    }

    @Override
    public YakuViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.yaku,viewGroup,false);
        return new YakuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(YakuViewHolder yakuViewHolder, int i) {
        yakuViewHolder.bind(yaku[i]);
    }

    @Override
    public int getItemCount() {
        return yaku.length;
    }
}
