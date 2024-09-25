package org.example.TestNG.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Hard_Assertions {

    @Test
    public void softAssertExample() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false); // This will not stop execution.
        System.out.println("This line will be executed.");

    }

    @Test
    public void hardAssertExample() {
        Assert.assertTrue(false); // This will throw an AssertionError and stop execution.
        System.out.println("This line will not be executed.");
    }





}
