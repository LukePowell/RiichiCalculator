package com.dragonwellstudios.mahjonghandhelper.riichi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dragonwellstudios.mahjonghandhelper.R;

/**
 * Created by Luke Powell on 10/7/15.
 * <p/>
 * Simple fragment to display a dialog using calculator_dialog.xml
 */
public class CalculatorFragment extends DialogFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.calculator_dialog, container);
    }
}
