package transport;

import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean isSummerRubber;
    private Key key;

    public Car(String brand, String model, double engineVolume, String color, int year,
               String country, String transmission, String bodyType, String registrationNumber,
               int numberOfSeats, boolean isSummerRubber, Key key) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateEgineVolume(engineVolume);
        this.color = validateCarColor(color);
        this.year = validateYear(year);
        this.country = validateCarParameters(country);
        this.transmission = validateTransmission(transmission);
        this.bodyType = validateBodyType(bodyType);
        this.registrationNumber = validateCarRegistrationNumber(registrationNumber);
        this.numberOfSeats = validateNumberOfSeats(numberOfSeats);
        this.isSummerRubber = isSummerRubber;
        this.key = key;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }
    public String getTransmission() {
        return transmission;
    }
    public String getBodyType() {
        return bodyType;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEgineVolume(engineVolume);
    }
    public void setColor(String color) {
        this.color = validateCarColor(color);
    }
    public void setTransmission(String transmission) {
        this.transmission = validateTransmission(transmission);
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = validateCarRegistrationNumber(registrationNumber);
    }
    public void setSummerRubber(boolean summerRubber) {
        isSummerRubber = summerRubber;
    }
    public boolean isSummerRubber() {
        return isSummerRubber;
    }
    public void changeTyres(int month) {
            if ((month >= 11 && month <=12) | (month >= 1 && month <= 3)) {
                isSummerRubber = false;
            }
            if (month >= 4 && month <=10) {
                isSummerRubber = true;
            }
    }
    public String validateCarRegistrationNumber(String number) {
        if (Pattern.matches("[А-Я][0-9]{3}[А-Я]{2}[0-9]{3}", number)) {
            return  number;
        } else {
            System.out.println("Номер некорректный");
            return "неверный номер";
        }
    }
    @Override
    public String toString() {
        return "Автомобиль: " + brand + " " + model + ", объем двигателя - " + engineVolume + ", цвет кузова - " +
                color + ", год выпуска - " + year + ", страна сборки - " + country + ", коробка передач - "
                + transmission + ", тип кузова - " + bodyType + ", регистрационный номер - " + registrationNumber +
                ", количество мест - " + numberOfSeats + ", резина - " + isSummerRubber + ", " + key;
    }
    public static double validateEgineVolume(double value){
        return value <= 0 ? 1.5 : value;
    }
    public static Integer validateYear(Integer value){
        return (value == null || value <= 0) ? 2000 : value;
    }
    public static String validateString(String value, String defaultValue){
        return (value == null || value.isBlank() || value.isEmpty()) ? defaultValue : value;
    }
    public static String validateCarParameters(String value){
        return validateString(value, "default");
    }
    public static String validateCarColor(String value){
        return validateString(value, "белый");
    }
    public int validateNumberOfSeats(int numberOfSeats){
        return numberOfSeats <= 0 ? 5 : numberOfSeats;
    }
    public static String validateTransmission(String value) {
        return validateString(value, "автомат");
    }
    public static String validateBodyType(String value) {
        return validateString(value, "default");
    }
    public static Boolean validateBoolean(Boolean value){
        return value != null && value;
    }

    public static class Key {
        private final Boolean remoteStart;
        private final Boolean keylessAccess;

        public Key(Boolean remoteStart, Boolean keylessAccess) {
            this.remoteStart = validateBoolean(remoteStart);
            this.keylessAccess = validateBoolean(keylessAccess);
        }
        @Override
        public String toString() {
            return "ключ: дистанционный запуск - " + remoteStart +
                    ", бесключевой доступ - " + keylessAccess;
        }
    }

}
