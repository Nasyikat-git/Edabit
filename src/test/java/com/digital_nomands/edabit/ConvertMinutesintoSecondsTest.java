package com.digital_nomands.edabit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConvertMinutesintoSecondsTest {
    @Test
    public void ConvertMinutes1() throws IllegalAccessException {
        Assert.assertEquals(ConvertMinutesintoSeconds.ConvertMinutesToSeconds(1), 60);;
    }
    @Test
    public void ConvertMinutes5() throws IllegalAccessException {
        Assert.assertEquals(ConvertMinutesintoSeconds.ConvertMinutesToSeconds(5), 300);;
    }
}
