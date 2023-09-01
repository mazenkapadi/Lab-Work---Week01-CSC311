package org.example;

public class CSC311_Week1Lab {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4, "Red", 2.0f, "Gasoline");
        Car car = new Car(4, "Blue", 2.0f, "Gasoline", "Toyota");

        car.displayInfo();
        car.honk();
    }
}