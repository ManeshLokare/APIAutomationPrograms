package org.example.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class Annotations {

    @BeforeSuite
    void demo1()
    {
        System.out.println("This will execute before the test suite");
    }

    @BeforeTest
    void demo2(){
        System.out.println("This will execute before the test");
    }

    @BeforeClass
    void demo3(){
        System.out.println("This will execute before the class");
    }

    @BeforeMethod
    void demo4(){
        System.out.println("This will execute before every Method");
    }

    @Test
    void test1(){
        System.out.println("Test1");
    }
    @Test
    void test2(){
        System.out.println("Test2");
    }

    @AfterMethod
    void demo6(){
        System.out.println("This will execute after every Method");
    }
    @AfterClass
    void demo7(){
        System.out.println("This will execute after the class");
    }

    @AfterTest
    void demo8(){
        System.out.println("This will execute after the test");
    }
    @AfterSuite
    void demo9(){
        System.out.println("This will execute after the test suite");
    }
}

