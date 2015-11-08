package com.dragonwellstudios.mahjonghandhelper.riichi;

import android.content.res.Resources;
import android.support.annotation.StringRes;

/**
 * Created by Luke Powell on 10/13/15.
 * <p/>
 * Formats a string to display a given payout
 */
public class StringResourcePayoutFormatter implements PayoutFormatter {

    private final int format;
    private final Resources resources;

    public StringResourcePayoutFormatter(Resources resources, @StringRes int format) {
        this.resources = resources;
        this.format = format;
    }

    @Override
    public String formatPayout(Payout payout) {
        return resources.getString(format, payout.getPayout(Payout.PAYOUT_ALL_OR_SINGLE));
    }
}
