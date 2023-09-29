package org.example;

public class Car extends Vehicle {
    public Car(String company, String model, int yearRelease) {
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
        this.numWheels = 4;
        this.speed = 0;
    }

    @Override
    public void testDrive() {
        speed = 60;
    }

    @Override
    public void park() {
        speed = 0;
    }
}