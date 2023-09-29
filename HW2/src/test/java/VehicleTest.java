import org.example.Car;
import org.example.Motorcycle;
import org.example.Vehicle;
//import org.junit.Test;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

//import static org.junit.Assert.assertEquals;

class VehicleTest {

    // Проверка, что экземпляр объекта Car также является экземпляром транспортного средства
    @Test
    void carIsInstanceOfVehicle() {
        Vehicle car = new Car("Toyota", "Camry", 2023);
        assertTrue(car instanceof Vehicle);
    }

    private void assertTrue(boolean b) {
    }

    // Проверка, что объект Car создается с 4-мя колесами.
    @Test
    void carHasFourWheels() {
        Car car = new Car("Kia", "Ceed", 2023);
        assertEquals(4, car.numWheels);
    }

    @Test
        // Проверка, что объект Motorcycle создается с 2-мя колесами.
    void motorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        assertEquals(2, motorcycle.numWheels);
    }

    /* Проверка, что объект Car развивает скорость 60 в режиме тестового вождения
     (используя метод testDrive()).
    */
    @Test
    void carAcceleratesTo60DuringTestDrive() {
        Car car = new Car("Kia", "Ceed", 2023);
        car.testDrive();
        assertEquals(60, car.speed);
    }

    /*
    Проверика, что объект Motorcycle развивает скорость 75
    в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    void motorcycleAcceleratesTo75DuringTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.speed);
    }

    /*
    Проверка, что в режиме парковки (сначала testDrive, потом park,
     т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    */
    @Test
    void carStopsWhenParked() {
        Car car = new Car("Kia", "Ceed", 2023);
        car.testDrive();
        car.park();
        assertEquals(0, car.speed);
    }

    /*
    Проверика, что в режиме парковки (сначала testDrive, потом park,
    т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    */
    @Test
    void motorcycleStopsWhenParked() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.speed);
    }
}
