package transport;

public class Main {
    public static void main(String[] args) {
        DriverB driverB1 = new DriverB("Иванов Степан Иванович", true, 18);
        DriverB driverB2 = new DriverB("Иванов Петр Иванович", true, 18);
        DriverB driverB3 = new DriverB("Иванов Иван Иванович", true, 18);
        DriverB driverB4 = new DriverB("Иванов Илья Иванович", true, 18);

        DriverC driverC1 = new DriverC("Петров Степан Иванович", true, 25);
        DriverC driverC2 = new DriverC("Петров Петр Иванович", true, 25);
        DriverC driverC3 = new DriverC("Петров Илья Иванович", true, 25);
        DriverC driverC4 = new DriverC("Петров Иван Иванович", true, 25);

        DriverD driverD1 = new DriverD("Семенов Иван Иванович", true, 7);
        DriverD driverD2 = new DriverD("Семенов Степан Иванович", true, 7);
        DriverD driverD3 = new DriverD("Семенов Петр Иванович", true, 7);
        DriverD driverD4 = new DriverD("Сесменов Руслан Иванович", true, 7);

        Car car1 = new Car(driverB1, "Lada", "Granta", 1.7);
        Car car2 = new Car(driverB2, "Audi", "A8", 3.0);
        Car car3 = new Car(driverB3, "BMW", "Z8", 3.0);
        Car car4 = new Car(driverB4, "Kia", "Rio", 1.6);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        Bus bus1 = new Bus(driverD1, "Беларусь", "222", 3.0);
        Bus bus2 = new Bus(driverD2, "Минск", "008", 2.7);
        Bus bus3 = new Bus(driverD3, "Урал", "456", 2.7);
        Bus bus4 = new Bus(driverD4, "Минск", "346", 3.0);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);

        Truck truck1 = new Truck(driverC1, "Man", "340n", 8.6);
        Truck truck2 = new Truck(driverC2, "Камаз", "675", 12.0);
        Truck truck3 = new Truck(driverC3, "Маз", "427", 6.7);
        Truck truck4 = new Truck(driverC4, "Белаз", "56", 7.6);

        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);



    }
}