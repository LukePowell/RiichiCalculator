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
        for(int i = 0; i < 49; ++i){
            Assert.assertEquals(0,ExtraMaths.roundToClosestHundred(i));
        }
        for(int i = 50; i < 100; ++i){
            Assert.assertEquals(100,ExtraMaths.roundToClosestHundred(i));
        }


        //Test values > 100
        for(int i = 3300; i < 3349; ++i){
            Assert.assertEquals(3300,ExtraMaths.roundToClosestHundred(i));
        }
        for(int i = 3350; i < 3400; ++i){
            Assert.assertEquals(3400,ExtraMaths.roundToClosestHundred(i));
        }
    }
}