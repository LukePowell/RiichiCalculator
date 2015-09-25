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

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.dragonwellstudios.mahjonghandhelper.BR;
import com.dragonwellstudios.mahjonghandhelper.R;
import com.dragonwellstudios.mahjonghandhelper.riichi.Yaku;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Luke Powell on 9/6/2015.
 *
 * Simple {@link android.support.v7.widget.RecyclerView.ViewHolder}
 */
public class YakuViewHolder extends RecyclerView.ViewHolder {
    private final ViewDataBinding binding;

    //region VIEWS ---------------------------------------------------------------------------------
    @Bind(R.id.yaku_name)
    TextView name;
    //endregion
    public YakuViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        binding = DataBindingUtil.bind(itemView);
    }

    public void bind(Yaku yaku) {
        binding.setVariable(BR.yaku, yaku);
        //name.setText(yaku.getName());
    }
}
