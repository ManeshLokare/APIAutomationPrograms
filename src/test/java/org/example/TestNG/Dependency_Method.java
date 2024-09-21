package org.example.TestNG;

import org.testng.annotations.Test;

public class Dependency_Method {

    @Test
    public void startCar()
    {
        System.out.println(" car started");
    }

    @Test (dependsOnMethods = {"startCar"})
    public void driveCar()
    {
        System.out.println(" car driving");
    }

    @Test (dependsOnMethods = {"driveCar"})
    public void stopCar()
    {
        System.out.println(" car stopped");
    }

    @Test (dependsOnMethods = {"driveCar","stopCar"})
    public void parkCar()
    {
        System.out.println(" car parked");
    }



}
