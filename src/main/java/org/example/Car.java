package org.example;

public class Car extends Vehicle{
    private String brand;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    public void honk() {
        System.out.println("Honk, honk!");
    }

    //Setters and getters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void displayInfo(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.getColor());
        System.out.println("Engine Size: " + this.getEngineSize());
        System.out.println("Fuel Type: " + this.getFuelType());
        System.out.println("Number of Wheels: " + this.getNumberOfWheels());
    }

}
