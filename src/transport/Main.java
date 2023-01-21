package transport;

public class Main {
    public static void main(String[] args) {
       Car car1 = new Car("Lada", "Granta", "желтый", 2015,
               "Россия", "200", 1.7, " ", " ",
               "Х342ХР178", 5, true, new Car.Key(true, true));
       Car car2 = new Car("Audi", "A8", "черный", 2020, "Германия",
                "300", 3.0, " ", "", "О987ОМ198",
                5, true, new Car.Key(true, true));
       Car car3 = new Car("BMW", "Z8", "черный", 2021, "Германия",
                "320", 3.0, " ", "", "С432СС177",
                5, false, new Car.Key(true, true));
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        Bus bus1 = new Bus("Беларусь", "222", "белый", 2022, "Беларусь", "250");
        Bus bus2 = new Bus("Минск", "008", "голубой", 2020, "Беларусь", "259");
        Bus bus3 = new Bus("Урал", "456", "белый", 2019, "Россия", "300");

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);









    }
}