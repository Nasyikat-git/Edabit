package com.digital_nomands.edabit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnTheSumOfTwoNumbersTest {

    @Test
    public void ReturnTheSumOfTwoNumbers1(){
        Assert.assertEquals(ReturnTheSumOfTwoNumbers.ReturnSum(5, 3), 8);
    }
}
