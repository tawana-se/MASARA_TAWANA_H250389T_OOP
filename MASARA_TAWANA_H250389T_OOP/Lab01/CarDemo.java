package Lab01;

class Car {
    String brand;
    int year;
    double mileage;

    Car(String brand, int year, double mileage) {
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Mileage: " + mileage);
    }

    boolean isAntique() {
        return (2026 - year) > 25;
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 2018, 50000);
        Car c2 = new Car("Mercedes Benz", 1995, 120000);
        Car c3 = new Car("Nissan", 2005, 95000);

        c1.display();
        c2.display();
        c3.display();

        System.out.println("Is c2 antique? " + c2.isAntique());
    }
}