package transport;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada", "Granta", 1.7, "желтый",
                2015, "Россия", " ", " ", "Х342ХР178",
                5, true, new Car.Key(true, true));
        Car car2 = new Car("Audi", "A8", 3.0, "черный", 2020,
                "Германия", " ", " ", "О987ОМ198", 5,
                true, new Car.Key(true, true));
        Car car3 = new Car("BMW", "Z8", 3.0, "черный", 2021,
                "Германия", " ", " ", "С432СС177", 4,
                true, new Car.Key(true, true));
        Car car4 = new Car("Kia", "Sportage", 2.4, "красный", 2018,
                "Южная Корея", " ", " ", "О987СМ188", 5,
                true, new Car.Key(true, true));
        Car car5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                "Южная Корея", " ", " ", "О657МУ177", 4,
                true, new Car.Key(true, true));

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        Car car6 = new Car(null, " ", 0, " ", 0, " ",
                " ", " ", " ", 5, true,
                new Car.Key(true, true));
        System.out.println(car6);







    }
}