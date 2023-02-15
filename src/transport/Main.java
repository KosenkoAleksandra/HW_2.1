package transport;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Mechanic mechanic1 = new Mechanic("Иван", "Крошин", "ООО Спецсервис");
        Mechanic mechanic2 = new Mechanic("Петр", "Ванин", "ИП Ванин");
        Mechanic mechanic3 = new Mechanic("Петр", "Трошин", "ООО СервисВИП");

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
        DriverD driverD4 = new DriverD("Семенов Руслан Иванович", true, 7);

        Car car1 = new Car(driverB1, "Lada", "Granta", 1.7, List.of(mechanic1), BodyType.SEDAN);
        Car car2 = new Car(driverB2, "Audi", "A8", 3.0, List.of(mechanic1), BodyType.SEDAN);
        Car car3 = new Car(driverB3, "BMW", "Z8", 3.0, List.of(mechanic2),null);
        Car car4 = new Car(driverB4, "Kia", "Rio", 1.6, List.of(mechanic3), BodyType.HATCHBACK);

//        System.out.println(car1);
//        System.out.println(car2);
//        System.out.println(car3);
//        System.out.println(car4);

        Bus bus1 = new Bus(driverD1, "Беларусь", "222", 3.0, List.of(mechanic2), BusCapacity.SMALL);
        Bus bus2 = new Bus(driverD2, "Минск", "008", 2.7, List.of(mechanic3), BusCapacity.AVERAGE);
        Bus bus3 = new Bus(driverD3, "Урал", "456", 2.7, List.of(mechanic3), BusCapacity.BIG);
        Bus bus4 = new Bus(driverD4, "Минск", "346", 3.0, List.of(mechanic1), BusCapacity.AVERAGE);

//        System.out.println(bus1);
//        System.out.println(bus2);
//        System.out.println(bus3);
//        System.out.println(bus4);

        Truck truck1 = new Truck(driverC1, "Man", "340n", 8.6, List.of(mechanic3), LoadType.N2);
        Truck truck2 = new Truck(driverC2, "Камаз", "675", 12.0, List.of(mechanic1), LoadType.N1);
        Truck truck3 = new Truck(driverC3, "Маз", "427", 6.7, List.of(mechanic2), LoadType.N3);
        Truck truck4 = new Truck(driverC4, "Белаз", "56", 7.6, List.of(mechanic2), LoadType.N3);

//        System.out.println(truck1);
//        System.out.println(truck2);
//        System.out.println(truck3);
//        System.out.println(truck4);

//        car1.passDiagnostics();
//        truck1.passDiagnostics();
//        bus1.passDiagnostics();


        List<Transport> racers = new ArrayList<>();
        racers.add(bus4);
        racers.add(car1);
        racers.add(truck2);

        mechanic3.fixTheCar(car3);
        mechanic3.toDiagnose(truck1);

        System.out.println("-------------------------");

        Queue<Transport> transportsOnSTO = new ArrayDeque<>();
        ServiceStation sto = new ServiceStation(transportsOnSTO);

        for (Transport transport : racers) {
            sto.addTransport(transport);
        }

        for (int j = 0; j <= transportsOnSTO.size(); j++) {
            sto.carryOutAVehicleInspection(transportsOnSTO);
        }

        System.out.println("----------------------------");

        Map<Transport, List<Mechanic>> mapTransport = new HashMap<>();
        mapTransport.put(car1, car1.getMechanicList());
        mapTransport.put(bus2, bus2.getMechanicList());
        mapTransport.put(truck4, truck4.getMechanicList());

        for (Map.Entry<Transport, List<Mechanic>> map : mapTransport.entrySet()){
            System.out.println("Транспортное средство -  " + map.getKey().getBrand() + " " + map.getKey().getModel() +
                    ", механик - " + map.getValue().get(0));
        }

        System.out.println("----------------------------------");
        Set <Driver> driverSet = new HashSet<>();
        driverSet.add(driverB1);
        driverSet.add(driverC2);
        driverSet.add(driverD4);
        driverSet.add(driverB1);
        driverSet.add(driverB2);
        driverSet.add(driverC1);

        Iterator<Driver> driverIterator = driverSet.iterator();
        while (driverIterator.hasNext()) {
            System.out.println(driverIterator.next());
        }
}
}