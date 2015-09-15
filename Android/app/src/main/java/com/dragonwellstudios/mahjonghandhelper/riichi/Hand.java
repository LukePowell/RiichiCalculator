package com.dragonwellstudios.mahjonghandhelper.riichi;

import com.dragonwellstudios.mahjonghandhelper.RuleSet;
import com.dragonwellstudios.mahjonghandhelper.Tile;

import java.util.ArrayList;

/**
 * Created by Luke Powell on 9/11/2015.
 *
 * Collection of {@link Tile} allowing scoring the hand with a given rule set
 */
public class Hand {
    ArrayList<Tile> tiles;

    public Hand(RuleSet ruleSet){

    }

    public int calculateFu(){
        return 0;
    }

    public int calculateHan(){
        return 0;
    }
}
