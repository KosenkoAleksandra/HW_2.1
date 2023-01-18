public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;
    public Car() {
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateEgineVolume(engineVolume);
        this.color = validateCarColor(color);
        this.year = validateYear(year);
        this.country = validateCarParameters(country);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Автомобиль: " + brand + " " + model + ", объем двигателя - " + engineVolume + ", цвет кузова - " +
                color + ", год выпуска - " + year + ", страна сборки - " + country;
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
}
