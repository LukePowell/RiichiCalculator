package com.dragonwellstudios.mahjonghandhelper.riichi;

/**
 * Created by Luke Powell on 10/5/15.
 *
 * Represents a payout to a given player
 */
public class Payout {
    //region CONSTANTS
    /**
     * Payment made by dealer
     */
    public final static int PAYOUT_DEALER = 0;
    /**
     * Payment made by non-dealer
     */
    public final static int PAYOUT_NONDEALER = 1;
    /**
     * Payment by dealer tsumo or ron by dealer or non-dealer
     */
    public final static int PAYOUT_ALL_OR_SINGLE = 0;

    public final static int NONE = 0;
    public final static int HANEMAN = 1;
    public final static int BAIMAN = 3;
    public final static int SANBAIMAN = 4;
    public final static int YAKUMAN = 5;
    //endregion

    int[] payments;//Allows us to store 1 to 2 ints as needed
    boolean ron;//
    int type;

    //region CONSTRUCTORS
    public Payout(int dealerPays, int nonDealerPays, boolean ron) {
        payments = new int[]{dealerPays,nonDealerPays};
        this.type = type;
        this.ron = ron;
    }

    public Payout(int allPayOrSinglePay, boolean ron) {
        payments = new int[]{allPayOrSinglePay};
        this.type = type;
        this.ron = ron;
    }
    //endregion

    /**
     * Get a payout for the selected payout type one of PAYOUT_DEALER, PAYOUT_NONDEALER,
     * PAYOUT_ALL_OR SINGLE
     * @param payout One of PAYOUT_DEALER, PAYOUT_NONDEALER, PAYOUT_ALL_OR_SINGLE
     * @return The selected payment
     */
    public int getPayout(int payout){
        return payments[payout];
    }

    /**
     * Is this a payment for ron
     * @return The value of ron
     */
    public boolean isRon(){
        return ron;
    }

    /**
     * Was this hand a limit hand of some variety
     * @return The type of limit if applicable NONE otherwise
     */
    public int getType(){
        return type;
    }
}
