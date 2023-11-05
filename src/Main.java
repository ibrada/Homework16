public class Main {

    public static void line() {
        System.out.println("* * * * *");
    }

    public static void main(String[] args) {

        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();
        line();
        station.check(car);
        line();
        station.check(car2);
        line();
        station.check(bicycle);
        line();
        station.check(bicycle2);
        line();
        station.check(truck);
        line();
        station.check(truck2);
        line();

    }
}