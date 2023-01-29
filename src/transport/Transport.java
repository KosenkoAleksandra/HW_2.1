package transport;

import static transport.ValidateUtils.*;

public abstract class Transport <T extends Driver> {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;


    public Transport(T driver,
                     String brand,
                     String model,
                     double engineVolume) {
        this.driver = driver;
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateEngineVolume(engineVolume);
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

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    @Override
    public String toString() {
        return "Водитель " + driver + "управляет транспортным средством: " + "марка - " + brand +
                ", модель - " + model + ", объём двигателя - " + engineVolume + ", будет участвовать в заезде.";
    }

    abstract void startMovingAuto ();
    abstract void finishMovingAuto ();
    public abstract void printType();


    }

