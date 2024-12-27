package com.digital_nomands.edabit;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ReturntheNextNumberfromtheIntegerPassedTest {

    @Test
    public void addNumTest(){
        Assert.assertEquals(ReturntheNextNumberfromtheIntegerPassed.addnum(5),6);
    }

}