package org.example.TestNG.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Hard_Assertions {

    SoftAssert soft_assert = new SoftAssert();
    @Test
    public void Soft_Assert()
    {
        soft_assert.assertTrue(false);
        System.out.println("soft assertion");
    }
    @Test
    public void Hard_Assert()
    {
        Assert.assertTrue(false);
        System.out.println("hard assertion");
    }



}
