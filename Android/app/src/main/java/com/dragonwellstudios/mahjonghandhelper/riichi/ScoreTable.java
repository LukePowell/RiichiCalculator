package com.dragonwellstudios.mahjonghandhelper.riichi;

import com.dragonwellstudios.mahjonghandhelper.ExtraMaths;
import com.dragonwellstudios.mahjonghandhelper.RuleSet;

/**
 * Created by Luke Powell on 9/11/2015.
 * <p/>
 * Allows simple scoring given han, fu, and dealer
 */
public class ScoreTable {
    private static final int LIMIT = 4;
    //region CONSTANTS
    public final int MANGAN_BASE_POINTS = 2000;
    public final int HANEMAN_BASE_POINTS = 3000;
    public final int BAIMAN_BASE_POINTS = 4000;
    public final int SANBAIMAN_BASE_POINTS = 6000;
    public final int YAKUMAN_BASE_POINTS = 8000;
    public final int DEALER_TSUMO_MULTIPLIER = 2;
    public final int DEALER_RON_MULTIPLIER = 6;
    public final int NONDEALER_TSUMO_DEALER_MULTIPLIER = 2;
    public final int NONDEALER_TSUMO_NONDEALER_MULTIPLIER = 1;
    public final int NONDEALER_RON_MULTIPLIER = 4;
    //endregion

    private RuleSet ruleSet;

    public ScoreTable(RuleSet ruleSet) {
        this.ruleSet = ruleSet;
    }

    /**
     * Calculates the base points for the given han and fu, this assumes that fu has already been
     * rounded to the correct value.
     *
     * @param han The han count
     * @param fu  The fu count
     * @return base points for the given han and fu
     */
    public int getBasePoints(int han, int fu) {
        switch (han) {
            case 1:
            case 2:
            case 3:
            case 4:
                return fu * (int) Math.pow(2, 2 + han);
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
     *
     * @param han The count of han in the hand
     * @param fu  The count of fu in the given hand
     * @return The final calculated score accounting for any rule set variations
     */
    public Payout getPayout(int han, int fu, boolean dealer, boolean ron) {
        //Determine the final score based on any current rule sets
        int basePoints = getBasePoints(han, fu);

        //Cap points to mangan for any hand 4 han or less greater than mangan
        if (basePoints > MANGAN_BASE_POINTS && han <= LIMIT) {
            basePoints = MANGAN_BASE_POINTS;
        }

        if (dealer) {
            int allPay = ron ? DEALER_RON_MULTIPLIER * basePoints : DEALER_TSUMO_MULTIPLIER * basePoints;
            allPay = ExtraMaths.roundUpToClosestHundred(allPay);
            return new Payout(allPay, ron);
        } else {
            if (!ron) {
                int dealerPays =
                        ExtraMaths.roundUpToClosestHundred(NONDEALER_TSUMO_DEALER_MULTIPLIER * basePoints);
                int nonDealerPays =
                        ExtraMaths.roundUpToClosestHundred(NONDEALER_TSUMO_NONDEALER_MULTIPLIER * basePoints);
                return new Payout(dealerPays, nonDealerPays, false);
            } else {
                int allPay =
                        ExtraMaths.roundUpToClosestHundred(NONDEALER_RON_MULTIPLIER * basePoints);
                return new Payout(allPay, true);
            }
        }
    }
}
