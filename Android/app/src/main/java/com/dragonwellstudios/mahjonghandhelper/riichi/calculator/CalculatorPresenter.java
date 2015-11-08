package com.dragonwellstudios.mahjonghandhelper.riichi.calculator;

import com.dragonwellstudios.mahjonghandhelper.riichi.Payout;
import com.dragonwellstudios.mahjonghandhelper.riichi.PayoutFormatter;
import com.dragonwellstudios.mahjonghandhelper.riichi.ScoreTable;

/**
 * Created by Luke Powell on 11/8/2015.
 *
 * Presents a Calculator
 */
public class CalculatorPresenter implements CalculatorContract.UserActionsListener {

    private final ScoreTable table;
    CalculatorContract.View view;
    int han;
    int fu;
    boolean dealer;
    PayoutFormatter formatter;

    /**
     * Calculate a CalculatorPresenter and connect it to the CalculatorContract.View it is
     * controlling the presentation of
     * @param view The view to present to
     */
    public CalculatorPresenter(CalculatorContract.View view, PayoutFormatter formatter, ScoreTable table){
        this.view = view;
        this.formatter = formatter;
        this.table = table;
    }

    private void showPayout(){
        view.showPayout(formatter.formatPayout(table.getPayout(han,fu,false,true)));
    }

    @Override
    public void setHan(int han) {
        this.han = han;
        showPayout();
    }

    @Override
    public void setFu(int fu) {
        this.fu = fu;
        showPayout();
    }

    @Override
    public void setDealer(boolean dealer) {
        this.dealer = dealer;
        showPayout();
    }
}
