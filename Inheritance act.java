class Vehicle {
    String brand;

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    String model;
    String color;
    String gasoline;
    String year_released;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Gasoline: " + gasoline);
        System.out.println("Year Released: " + year_released);
        
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Vios";
        myCar.color = "Purple";
        myCar.gasoline = "Unleaded";
        myCar.year_released = "1933";

        myCar.start();
        myCar.displayInfo();
    }
}
