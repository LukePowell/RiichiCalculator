package com.dragonwellstudios.mahjonghandhelper.riichi.calculator;

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

    //Map an index given in setHan, setFu to the actual value it represents
    int[] hanValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    int[] fuValues = {20,25,30,40,50,60,70,80,90,100,110};

    int han = hanValues[0];
    int fu = fuValues[0];
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
        view.showPayout(formatter.formatPayout(table.getPayout(han,fu,dealer,true)));
    }

    @Override
    public void initialize() {
        showPayout();
    }

    @Override
    public void setHan(int han) {
        this.han = hanValues[han];
        showPayout();
    }

    @Override
    public void setFu(int fu) {
        this.fu = fuValues[fu];
        showPayout();
    }

    @Override
    public void setDealer(boolean dealer) {
        this.dealer = dealer;
        showPayout();
    }

    @Override
    public void setKiriage(boolean kiriage) {

    }
}
