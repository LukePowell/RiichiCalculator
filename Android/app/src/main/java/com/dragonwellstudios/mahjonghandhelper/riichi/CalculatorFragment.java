package com.dragonwellstudios.mahjonghandhelper.riichi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.dragonwellstudios.mahjonghandhelper.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Luke Powell on 10/7/15.
 * <p/>
 * Simple fragment to display a dialog using calculator_dialog.xml
 */
public class CalculatorFragment extends DialogFragment {

    //region constants
    /**
     * Valid values for {@see R.id.hanPicker}
     */
    private static final String[] hanValues = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13+"};
    /**
     * Valid values for {@see R.id.fuPicker}
     */
    private static final String[] fuValues = {"20", "25", "30", "40", "50", "60", "70", "80", "90", "100", "110"};
    //endregion



    //region VIEWS
    @Bind(R.id.hanNumberPicker)
    NumberPicker hanPicker;
    @Bind(R.id.fuNumberPicker)
    NumberPicker fuPicker;
    @Bind(R.id.scoreDisplay)
    TextView scoreDisplay;
    //endregion

    @Override
    public void onStart() {
        super.onStart();

        ButterKnife.bind(this, getView());

        hanPicker.setMaxValue(hanValues.length - 1);
        hanPicker.setDisplayedValues(hanValues);

        fuPicker.setMaxValue(fuValues.length - 1);
        fuPicker.setDisplayedValues(fuValues);

        StringResourcePayoutFormatter formatter =
                new StringResourcePayoutFormatter(getContext().getResources(), R.string.payout);
        scoreDisplay.setText(formatter.formatPayout(new Payout(2000, true)));
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.calculator_dialog, container);
    }
}
