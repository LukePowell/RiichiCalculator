package com.dragonwellstudios.mahjonghandhelper.riichi.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.dragonwellstudios.mahjonghandhelper.R;
import com.dragonwellstudios.mahjonghandhelper.riichi.Yaku;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Luke Powell on 9/6/2015.
 */
public class YakuViewHolder extends RecyclerView.ViewHolder {
    //region VIEWS ---------------------------------------------------------------------------------
    @Bind(R.id.yaku_name)
    TextView name;
    //endregion
    public YakuViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void bind(Yaku yaku) {
        name.setText(yaku.getName());
    }
}
