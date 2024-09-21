package org.example.TestNG;

import org.testng.annotations.Test;

public class Prioritization {

    @Test(priority = 0)
    public void testOne()
    {
        System.out.println("this test case 1");
    }
    @Test(priority = 1)
    public void testTwo()
    {
        System.out.println("this test case 2");
    }
    @Test(priority = 2)
    public void testThree()
    {
        System.out.println("this test case 3");
    }





}
