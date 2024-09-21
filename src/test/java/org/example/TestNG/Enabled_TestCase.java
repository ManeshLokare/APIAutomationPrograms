package org.example.TestNG;

import org.testng.annotations.Test;

public class Enabled_TestCase {
    @Test(enabled = true)
    public void testOne()
    {
        System.out.println("this test case 1");
    }
    @Test(enabled = false)
    public void testTwo()
    {
        System.out.println("this test case 2");
    }
    @Test(enabled = true)
    public void testThree()
    {
        System.out.println("this test case 3");
    }
}
