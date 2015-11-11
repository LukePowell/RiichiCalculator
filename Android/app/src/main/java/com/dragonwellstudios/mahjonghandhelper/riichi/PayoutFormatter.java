package com.dragonwellstudios.mahjonghandhelper.riichi;

/**
 * Created by lukepowell on 10/11/15.
 * <p/>
 * Formats a payout for display
 */
public interface PayoutFormatter {
    /**
     * Formats a given Payout into a string
     *
     * @param payout The payout to format for display
     * @return A string representing a payout formatted for display
     */
    String formatPayout(Payout payout);
}
