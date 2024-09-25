package org.example.TestNG.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Assertion {

     @Test
    public void test_verify()
     {
        String name = "Manesh";
         Assert.assertEquals("Manesh","Manesh");
     }



}
