package com.digital_nomands.edabit;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BasicVariableAssignmentTest {

    @Test
    public void testNameString(){
        Assert.assertEquals("AiperiEdabit", BasicVariableAssignment.nameString("Aiperi"));
    }

}