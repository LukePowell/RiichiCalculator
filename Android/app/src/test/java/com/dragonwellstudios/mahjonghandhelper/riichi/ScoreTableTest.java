package com.dragonwellstudios.mahjonghandhelper.riichi;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Luke Powell on 10/5/15.
 *
 */
public class ScoreTableTest {

    //region CONSTANTS
    //Array of the base points generated by each incremental han value
    public int[][] basePoints = {
        {160, 200, 240, 320, 400, 480, 560, 640, 720, 800, 880},
        {320, 400, 480, 640, 800, 960, 1120, 1280, 1440, 1600, 1760},
        {640, 800, 960, 1280, 1600, 1920, 2240, 2560, 2880, 3200, 3520},
        {1280, 1600, 1920, 2560, 3200, 3840, 4480, 5120, 5760, 6400, 7040},
        {2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000},
        {3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000},
        {3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000},
        {4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000},
        {4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000},
        {4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000},
        {6000, 6000, 6000, 6000, 6000, 6000, 6000, 6000, 6000, 6000, 6000},
        {6000, 6000, 6000, 6000, 6000, 6000, 6000, 6000, 6000, 6000, 6000},
        {8000, 8000, 8000, 8000, 8000, 8000, 8000, 8000, 8000, 8000, 8000}
    };

    //Values of fu we actually care about
    public int validFu[] = {20,25,30,40,50,60,70,80,90,100,110};
    //endregion



    @Test
    public void testGetBasePoints() throws Exception {
        ScoreTable table = new ScoreTable(null);
        for(int han = 0; han < 13; ++han){
            int i = 0;
            for(int fu : validFu){
                int basePoint = table.getBasePoints(han+1,validFu[i]);
                Assert.assertEquals(basePoints[han][i],basePoint);
                ++i;
            }
        }
    }

    @Test
    public void testGetPayout() throws Exception {

    }
}