package com.dragonwellstudios.mahjonghandhelper.riichi.calculator;

import android.text.Spannable;

/**
 * Created by Luke Powell on 11/8/2015.
 *
 * MVP contract for Calculator
 */
public class CalculatorContract {
    public interface View{
        void showPayout(String payout);
    }

    public interface UserActionsListener{
        void setHan(int han);
        void setFu(int fu);
        void setDealer(boolean dealer);
    }
}
