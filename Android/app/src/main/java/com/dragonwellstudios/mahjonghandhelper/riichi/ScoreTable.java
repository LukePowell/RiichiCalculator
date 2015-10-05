package com.dragonwellstudios.mahjonghandhelper.riichi;

import com.dragonwellstudios.mahjonghandhelper.RuleSet;

/**
 * Created by Luke Powell on 9/11/2015.
 *
 * Allows simple scoring given han, fu, and dealer
 */
public class ScoreTable {
    private RuleSet ruleSet;

    public ScoreTable(RuleSet ruleSet){
        this.ruleSet = ruleSet;
    }

    //region CONSTANTS
    public final int MANGAN_BASE_POINTS = 2000;
    public final int HANEMAN_BASE_POINTS = 3000;
    public final int BAIMAN_BASE_POINTS = 4000;
    public final int SANBAIMAN_BASE_POINTS = 6000;
    public final int YAKUMAN_BASE_POINTS = 8000;
    //endregion

    /**
     * Calculates the base points for the given han and fu, this assumes that fu has already been
     * rounded to the correct value.
     * @param han The han count
     * @param fu The fu count
     * @return base points for the given han and fu
     */
    public int getBasePoints(int han, int fu){
        switch(han){
            case 1:
            case 2:
            case 3:
            case 4:
                return fu * (int)Math.pow(2,2+han);
            case 5:
                return MANGAN_BASE_POINTS;
            case 6:
            case 7:
                return HANEMAN_BASE_POINTS;
            case 8:
            case 9:
            case 10:
                return BAIMAN_BASE_POINTS;
            case 11:
            case 12:
                return SANBAIMAN_BASE_POINTS;
            default://Handled all valid values < Yakuman, thus default to yakuman
                return YAKUMAN_BASE_POINTS;
        }
    }

    /**
     * Calculates the final score from the given han and fu values
     * @param han The count of han in the hand
     * @param fu The count of fu in the given hand
     * @return The final calculated score accounting for any rule set variations
     */
     public Payout getPayout(int han, int fu, boolean dealer, boolean ron){
        //Determine the final score based on any current rule sets
        return null;
    }
}
