package com.dragonwellstudios.mahjonghandhelper;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Luke Powell on 10/5/15.
 *
 * {@link ExtraMaths} test harness
 */
public class ExtraMathsTest {

    @Test
    public void testRoundToClosestHundred() throws Exception {
        //Test values < 100
        for(int i = 0; i <= 100; ++i){
            Assert.assertEquals(i % 100 == 0 ? i : 100, ExtraMaths.roundUpToClosestHundred(i));
        }
    }
}