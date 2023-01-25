package transport;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.7);
        Car car2 = new Car("Audi", "A8", 3.0);
        Car car3 = new Car("BMW", "Z8", 3.0);
        Car car4 = new Car("Kia", "Rio", 1.6);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        Bus bus1 = new Bus("Беларусь", "222", 3.0);
        Bus bus2 = new Bus("Минск", "008", 2.7);
        Bus bus3 = new Bus("Урал", "456", 2.7);
        Bus bus4 = new Bus("Минск", "346", 3.0);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);

        Truck truck1 = new Truck("Man", "340n", 8.6);
        Truck truck2 = new Truck("Камаз", "675", 12.0);
        Truck truck3 = new Truck("Маз", "427", 6.7);
        Truck truck4 = new Truck("Белаз", "56", 7.6);
        
        DriverB driverB = new DriverB("Иванов Иван Иванович", true, 18);
        DriverC driverC = new DriverC("Иванов Илья Иванович", true, 25);
        DriverD driverD = new DriverD("Иванов Степан Иванович", true, 7);

       
        printAutoControl(car1, driverB);
        printAutoControl(truck1, driverC);
        printAutoControl(bus1, driverD);


    }

    public static <C, D> void printAutoControl(C transport, D driver) {
        System.out.println("Водитель категории " + driver
                + " управляет " + transport + " и будет участвовать в заезде");
    }
}