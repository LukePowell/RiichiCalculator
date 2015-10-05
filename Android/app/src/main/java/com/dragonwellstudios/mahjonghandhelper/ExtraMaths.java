package com.dragonwellstudios.mahjonghandhelper;

/**
 * Created by Luke Powell on 10/5/15.
 *
 * Some extra math related methods
 */
public class ExtraMaths {

    /**
     * Rounds a given integer up to closest value divisible by 100
     * @param value The integral value to round
     * @return The given
     */
    public static int roundUpToClosestHundred(int value){
        return value % 100 == 0 ? value : value + 100 - value % 100;
    }
}
