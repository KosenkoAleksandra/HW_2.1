package transport;

import static transport.ValidateUtils.*;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
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
        return "Транспортное средство: " + "марка - " + brand +
                ", модель - " + model + ", объём двигателя - " + engineVolume;
    }

    abstract void startMoving ();
    abstract void finishMoving ();


    }

