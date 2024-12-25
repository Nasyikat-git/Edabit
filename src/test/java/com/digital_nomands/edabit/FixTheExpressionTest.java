package com.digital_nomands.edabit;

import org.junit.Assert;
import org.junit.Test;

import static com.digital_nomands.edabit.FixTheExpression.isSeven;

public class FixTheExpressionTest {
    @Test
    public void isSevenShouldReturnTrue() {
        Assert.assertTrue(isSeven(7));
    }

    @Test
    public void isSevenShouldReturnFalse() {
        Assert.assertFalse(isSeven(8));
    }
}