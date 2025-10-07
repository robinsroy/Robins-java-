abstract class Vehicle {
    abstract void startEngine();
    void stopEngine() {
        System.out.println("Vehicle engine stopped.");
    }
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started.");
    }
}

class Bike extends Vehicle {
    void startEngine() {
        System.out.println("Bike engine started.");
    }
}

public class VehiclesDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.startEngine();
        v1.stopEngine();

        Vehicle v2 = new Bike();
        v2.startEngine();
        v2.stopEngine();
    }
}
