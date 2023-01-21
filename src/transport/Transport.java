package transport;

public class Transport {
    private final String brand;
    private final String model;
    private String color;
    private final int year;
    private final String country;
    private String maxSpeed;

    public Transport(String brand, String model, String color, int year, String country, String maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.color = validateCarParameters(color);
        this.year = year;
        this.country = country;
        this.maxSpeed = validateCarParameters(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
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

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public static String validateString(String value, String defaultValue){
        return (value == null || value.isBlank() || value.isEmpty()) ? defaultValue : value;
    }
    public static String validateCarParameters(String value){
        return validateString(value, "default");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                '}';
    }
}
