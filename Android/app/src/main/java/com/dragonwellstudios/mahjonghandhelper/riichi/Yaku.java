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

package com.dragonwellstudios.mahjonghandhelper.riichi;

import com.dragonwellstudios.mahjonghandhelper.Tile;

/**
 * Created by Luke Powell on 9/6/2015.
 *
 * Stores all the necessary information about a yaku to be displayed
 *
 */
public class Yaku {
    //region FIELDS --------------------------------------------------------------------------------
    String name;
    String description;
    int han;

    /**
     * Example hand for this yaku
     */
    Tile[] hand;
    /**
     * Tiles that can complete the yaku
     */
    Tile[] agari;
    //endregion

    //region CONSTRUCTORS --------------------------------------------------------------------------
    /**
     * Keeps an empty constructor for anything that needs it
     */
    public Yaku(){
    }

    public Yaku(String name, String description, int han){}
    //endregion

    //region GETTERS/SETTERS -----------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHan() {
        return han;
    }

    public void setHan(int han) {
        this.han = han;
    }

    public Tile[] getHand() {
        return hand;
    }

    public void setHand(Tile[] hand) {
        this.hand = hand;
    }

    public Tile[] getAgari() {
        return agari;
    }

    public void setAgari(Tile[] agari) {
        this.agari = agari;
    }
    //endregion
}
