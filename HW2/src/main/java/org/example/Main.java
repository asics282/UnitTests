package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Kia", "Ceed", 2023);
        car.testDrive();

        System.out.println("Car: " + car.company + " " + car.model);
        System.out.println("Число колес: " + car.numWheels);
        System.out.println("Скорость: " + car.speed);

        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);

        motorcycle.testDrive();

        System.out.println("Motorcycle: " + motorcycle.company + " " + motorcycle.model);
        System.out.println("Число колес: " + motorcycle.numWheels);
        System.out.println("Скорость: " + motorcycle.speed);

    }
}