package org.example;

public abstract class Vehicle {
    String company;
    String model;
    int yearRelease;
    public int numWheels;
    public int speed;

    abstract void testDrive();

    abstract void park();
}