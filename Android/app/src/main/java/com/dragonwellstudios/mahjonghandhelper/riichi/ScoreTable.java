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

    /**
     * Calculates the final score from the given han and fu values
     * @param han The count of han in the hand
     * @param fu The count of fu in the given hand
     * @return The final calculated score accounting for any rule set variations
     */
     public int getFinalScore(int han, int fu, boolean dealer){
        //Determine the final score based on any current rule sets
        return -1;
    }
}
