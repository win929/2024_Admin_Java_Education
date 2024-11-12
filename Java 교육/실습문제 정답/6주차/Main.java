public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.speedCheck();
        car.speedUp();
        car.speedCheck();

        bicycle.speedCheck();
        bicycle.speedUp();
        bicycle.speedCheck();

        Vehicle vehicle = new Car();
        System.out.println(vehicle.name);

        Vehicle vehicle2 = new Bicycle();
        vehicle2.sound();
    }
}

abstract class Vehicle {
    String name = "Vehicle";
    int speed = 0;

    void sound() {
        System.out.println("부우우웅");
    }

    void speedCheck() {
        System.out.println(speed + "km/h");
    }

    abstract void speedUp();
}

class Car extends Vehicle {
    String name = "Car";

    @Override
    void speedUp() {
        speed += 10;
    }
}

class Bicycle extends Vehicle {
    @Override
    void sound() {
        System.out.println("따르릉");
    }

    @Override
    void speedUp() {
        speed += 5;
    }
}
