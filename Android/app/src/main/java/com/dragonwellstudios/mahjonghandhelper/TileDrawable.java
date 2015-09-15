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

import android.content.res.Resources;
import android.content.res.TypedArray;

/**
 * Created by Luke Powell on 9/6/2015.
 *
 * Maps a {@link Tile} to a id of an image in drawable
 */
public class TileDrawable {
    int id;

    //region CONSTRUCTORS --------------------------------------------------------------------------
    public TileDrawable(Tile tile, Resources resources) {
        id = resources.obtainTypedArray(tile.getSuit()).getInt(tile.getValue(), Tile.BLANK);
        TypedArray array;
        switch (tile.getSuit()) {
            case Tile.MANZU:
                array = resources.obtainTypedArray(R.array.manzu);
                break;
            case Tile.SOUZU:
                array = resources.obtainTypedArray(R.array.souzu);
                break;
            case Tile.PINZU:
                array = resources.obtainTypedArray(R.array.pinzu);
                break;
            case Tile.SANGENPAI:
                array = resources.obtainTypedArray(R.array.sagenpai);
                break;
            case Tile.KAZEHAI:
                array = resources.obtainTypedArray(R.array.kazehai);
                break;
            case Tile.BLANK:
                array = resources.obtainTypedArray(R.array.blank);
                break;
            default:
                array = resources.obtainTypedArray(R.array.blank);
                break;
        }

        id = resources.obtainTypedArray(R.array.blank).getInt(tile.getValue(), Tile.BLANK);
        array.recycle();
    }
    //endregion

    public int getDrawableID(){
        return id;
    }
}
