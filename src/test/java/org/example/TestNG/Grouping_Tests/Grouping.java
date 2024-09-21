package org.example.TestNG.Grouping_Tests;

import org.testng.annotations.Test;

public class Grouping {

    @Test(groups = {"sanity"})
    public void test1()
    {
        System.out.println("this tc related sanity");
    }
    @Test(groups = {"regression"})
    public void test2()
    {
        System.out.println("this tc related regression");
    }
    @Test(groups = {"smoke"})
    public void test3()
    {
        System.out.println("this tc related smoke");
    }
    @Test(groups = {"sanity","smoke"})
    public void test4()
    {
        System.out.println("test case related sanity");
        System.out.println("test case related smoke");
    }
    @Test(groups = {"regression","sanity"})
    public void test5()
    {
        System.out.println("test case related regression");
        System.out.println("test case related sanity");
    }


}
