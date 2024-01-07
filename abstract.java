abstract class Vehicle {
    abstract void type();
    abstract void company();
    abstract void mode();
    abstract void price();
}

class Car extends Vehicle {
    void type() {
        System.out.println("Type: Sport Z4");
    }
    void company() {
        System.out.println("Company: BMW");
    }
    void mode() {
        System.out.println("Car");
    }
    void price() {
        System.out.println("Price: 10000000");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Car c = new Car();
        c.company();
        c.type();
        c.mode();
        c.price();
    }
}
