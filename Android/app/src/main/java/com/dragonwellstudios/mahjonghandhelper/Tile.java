package com.dragonwellstudios.mahjonghandhelper;

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
}