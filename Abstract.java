// Abstract class
abstract class Car {
    String brand = "Toyota";

    abstract void startEngine();
    abstract void stopEngine();

    void showBrand() {
        System.out.println("Car Brand: " + brand);
    }
}

// Subclass Toyota Vios
class ToyotaVios extends Car {

    @Override
    void startEngine() {
        System.out.println("Toyota Vios engine started using push button.");
    }

    @Override
    void stopEngine() {
        System.out.println("Toyota Vios engine stopped when you stepped on the break.");
    }

    void showModel() {
        System.out.println("Model: Toyota Vios 2024");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car myCar = new ToyotaVios();   // Abstraction + Polymorphism

        myCar.showBrand();
        myCar.startEngine();
        myCar.stopEngine();

        // To access showModel(), cast to ToyotaVios
        ((ToyotaVios) myCar).showModel();
    }
}
