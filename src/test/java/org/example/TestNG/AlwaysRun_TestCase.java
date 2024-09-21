package org.example.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun_TestCase {
    @Test
    public void startCar()
    {
        System.out.println(" car started");
        Assert.fail();
    }

    @Test (dependsOnMethods = {"startCar"},alwaysRun = true)
    public void driveCar()
    {
        System.out.println(" car driving");
    }

    @Test (dependsOnMethods = {"driveCar"},alwaysRun = true)
    public void stopCar()
    {
        System.out.println(" car stopped");
    }

    @Test (dependsOnMethods = {"driveCar","stopCar"},alwaysRun = true)
    public void parkCar()
    {
        System.out.println(" car parked");
    }
}
