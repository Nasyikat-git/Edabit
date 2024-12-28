package com.digital_nomands.edabit;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class Tasks_1_Test {

    @Test
    public void AretheNumbersEqualTrue(){
        Assert.assertTrue(Tasks_1.AretheNumbersEqual(4,4));
    }

    @Test
    public void AretheNumbersEqualFalse(){
        Assert.assertFalse(Tasks_1.AretheNumbersEqual(5,4));
    }

    @Test
    public void UpvotesvsDownvotesTest(){
        Assert.assertEquals(Tasks_1.UpvotesvsDownvotes(Map.of("upvotes",13, "downupvotes",10)),3);
    }

    @Test
    public void ConvertHoursintoSecondsTest(){
        Assert.assertEquals(Tasks_1.ConvertHoursintoSeconds(1),3600);
    }

}
