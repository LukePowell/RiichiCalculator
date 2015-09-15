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
import android.support.annotation.DrawableRes;
import android.support.annotation.IntDef;
import android.support.annotation.IntRange;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Luke Powell on 9/6/2015.
 *
 * Represents a single Mahjong tile
 */
public final class Tile {

    //region SUITS ---------------------------------------------------------------------------------
    @IntDef({MANZU, SOUZU, PINZU, KAZEHAI, SANGENPAI, BLANK})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Suit{}

    public static final int MANZU = 1;
    public static final int SOUZU = 2;
    public static final int PINZU = 3;
    public static final int KAZEHAI = 4;
    public static final int SANGENPAI = 5;
    public static final int BLANK = 0;

    public static boolean isHonor(@Suit int suit){
        return suit == KAZEHAI || suit == SANGENPAI;
    }
    //endregion

    @Suit int suit;

    @IntRange(from = -1,to = 9)
    int value;

    //region CONSTRUCTORS --------------------------------------------------------------------------
    /**
     * Creates a blank Tile
     */
    public Tile(){
        suit = Tile.BLANK;
        value = -1;
    }

    /**
     * Creates a tile with the given suit and value
     * @param suit The {@link com.dragonwellstudios.mahjonghandhelper.Tile.Suit}
     * @param value The value
     */
    public Tile(@Suit int suit, int value){
        this.suit = suit;
        this.value = value;
    }
    //endregion

    //region GETTERS/SETTERS -----------------------------------------------------------------------
    /**
     * Retrieves the {@link com.dragonwellstudios.mahjonghandhelper.Tile.Suit}
     * @return The suit of this tile
     */
    public @Suit int getSuit(){
        return suit;
    }

    public int getValue(){
        return value;
    }
    //endregion

    //region DRAWABLE ------------------------------------------------------------------------------
    @DrawableRes int getDrawable(Resources resources){
        TypedArray array;
        switch (suit){
            case MANZU:
                array = resources.obtainTypedArray(R.array.manzu);
                break;
            case SOUZU:
                array = resources.obtainTypedArray(R.array.souzu);
                break;
            case PINZU:
                array = resources.obtainTypedArray(R.array.pinzu);
                break;
            case SANGENPAI:
                array = resources.obtainTypedArray(R.array.sagenpai);
                break;
            case KAZEHAI:
                array = resources.obtainTypedArray(R.array.kazehai);
                break;
            case BLANK:
                array = resources.obtainTypedArray(R.array.blank);
                break;
            default:
                array = resources.obtainTypedArray(R.array.blank);
                break;
        }

        int id = resources.obtainTypedArray(R.array.blank).getInt(value,BLANK);
        array.recycle();
        return id;
    }
    //endregion
}
