package com.dragonwellstudios.mahjonghandhelper.riichi;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.dragonwellstudios.mahjonghandhelper.BR;

/**
 * Created by Luke Powell on 10/10/15.
 *
 * View model used in calculator fragment
 */
public class CalculatorViewModel extends BaseObservable {

    private final ScoreTable table;
    private final PayoutFormatter formatter;

    private int han = 1;
    private int fu = 20;
    private Payout payout;
    private String payoutFormatted;

    public CalculatorViewModel(ScoreTable table, PayoutFormatter formatter) {
        this.table = table;
        this.formatter = formatter;
    }

    @Bindable
    public int getHan() {
        return han;
    }

    public void setHan(int value) {
        han = value;
        payout = table.getPayout(han, fu, false, false);
        notifyPropertyChanged(BR.han);
    }

    @Bindable
    public int getFu() {
        return fu;
    }

    public void setFu(int value) {
        fu = value;
        notifyPropertyChanged(BR.fu);
    }
}
