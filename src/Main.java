public class Main {
    public static void main(String[] args) {
        // Задание 1.
        Car car1 = new Car();
        car1.setBrand("Lada");
        car1.setModel("Granta");
        car1.setEngineVolume(1.7);
        car1.setColor("желтый");
        car1.setYear(2015);
        car1.setCountry("Россия");

        Car car2 = new Car();
        car2.setBrand("Audi");
        car2.setModel("A8");
        car2.setEngineVolume(3.0);
        car2.setColor("черный");
        car2.setYear(2020);
        car2.setCountry("Германия");

        Car car3 = new Car();
        car3.setBrand("BMW");
        car3.setModel("Z8");
        car3.setEngineVolume(3.0);
        car3.setColor("черный");
        car3.setYear(2021);
        car3.setCountry("Германия");

        Car car4 = new Car();
        car4.setBrand("Kia");
        car4.setModel("Sportage");
        car4.setEngineVolume(2.4);
        car4.setColor("красный");
        car4.setYear(2018);
        car4.setCountry("Южная Корея");

        Car car5 = new Car();
        car5.setBrand("Hyundai");
        car5.setModel("Avante");
        car5.setEngineVolume(1.6);
        car5.setColor("оранжевый");
        car5.setYear(2016);
        car5.setCountry("Южная Корея");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        // Задангие 2.

        Car car6 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car car7 = new Car("Audi", "A8", 3.0, "черный", 2020, "Германия");
        Car car8 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car car9 = new Car("Kia", "Sportage", 2.4, "красный", 2018, "Южная Корея");
        Car car10 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        System.out.println(car6);
        System.out.println(car7);
        System.out.println(car8);
        System.out.println(car9);
        System.out.println(car10);








    }
}