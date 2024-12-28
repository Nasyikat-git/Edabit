package com.digital_nomands.edabit;

import junit.framework.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tasks_2_Test extends TestCase {

    @Test
    public void MaxEdge() {
        Assert.assertEquals(Tasks_2.MaximumEdgeTriangle(8, 6), 13);
    }

    @Test
    public void FindPerimeter(){
        Assert.assertEquals(Tasks_2.FindThePerimeterOfARectangle(9, 4), 26);
    }


    @Test
    public void Calculator(){
        Assert.assertEquals(Tasks_2.PowerCalculator(100, 40), 4000);
    }

    @Test
    public void AreaTriangle(){
        Assert.assertEquals(Tasks_2.AreaOfATriangle(7, 6), 21);
    }

    @Test
    public void LessOrEqualToZero(){
        Assert.assertTrue(Tasks_2.IsTheNumberLessThanOrEqualToZero(-6));
    }

    @Test
    public void Remainder(){
        Assert.assertEquals(Tasks_2.Remainder(5, 5), 0);
    }
}