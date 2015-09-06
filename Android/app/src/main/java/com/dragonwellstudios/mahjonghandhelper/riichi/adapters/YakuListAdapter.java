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
