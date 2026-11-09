class Vehicle {
    String make;
    String model;
    int year;
    double fuel;

    Vehicle(String make, String model, int year, double fuel) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel = fuel;
    }

    void fuelEfficiency() {
        System.out.println("Fuel efficiency calculations");
    }

    void distanceTravelled() {
        System.out.println("Distance travelled");
    }

    void maxspeed() {
        System.out.println("Maximum speed");
    }
}

class Truck extends Vehicle {
    Truck(String make, String model, int year, double fuel) {
        super(make, model, year, fuel);
    }

    void fuelEfficiency() {
        System.out.println("Truck fuel efficiency is 8 km/l");
    }

    void distanceTravelled() {
        System.out.println("Truck Distance: 400 Km");
    }

    void maxspeed() {
        System.out.println("Truck maximum speed: 100 Km/h");
    }
}

class Car extends Vehicle {
    Car(String make, String model, int year, double fuel) {
        super(make, model, year, fuel);
    }

    void fuelEfficiency() {
        System.out.println("Car fuel efficiency is 18 km/l");
    }

    void distanceTravelled() {
        System.out.println("Car Distance: 500 Km");
    }

    void maxspeed() {
        System.out.println("Car maximum speed: 180 Km/h");
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year, double fuel) {
        super(make, model, year, fuel);
    }

    void fuelEfficiency() {
        System.out.println("Motorcycle fuel efficiency is 45 km/l");
    }

    void distanceTravelled() {
        System.out.println("Motorcycle Distance: 300 Km");
    }

    void maxspeed() {
        System.out.println("Motorcycle maximum speed: 120 Km/h");
    }
}

 class Main {
    public static void main(String args[]) {

        Car c = new Car("Maruti", "Swift", 2024, 30);

        System.out.println(c.make);
        System.out.println(c.model);
        System.out.println(c.year);

        c.fuelEfficiency();
        c.distanceTravelled();
        c.maxspeed();
    }
}
