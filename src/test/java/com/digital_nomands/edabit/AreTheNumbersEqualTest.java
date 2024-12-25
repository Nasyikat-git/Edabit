package com.digital_nomands.edabit;

import junit.framework.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AreTheNumbersEqualTest extends TestCase {

    @Test
    public void testIsNumbersEqualsTrue(){
        Assert.assertTrue(AreTheNumbersEqual.isEqual(6,6));
    }
    @Test
    public void testIsNumbersEqualsFalse() {
        Assert.assertFalse(AreTheNumbersEqual.isEqual(4, 7));
    }
}