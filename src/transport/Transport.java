package transport;

import java.util.ArrayList;
import java.util.List;

import static transport.ValidateUtils.*;

public abstract class Transport <T extends Driver> {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private List<Mechanic> mechanicList;


    public Transport(T driver,
                     String brand,
                     String model,
                     double engineVolume, List<Mechanic> mechanicList) {
        this.driver = driver;
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.mechanicList = mechanicList;
    }

    public T getDriver() {
        return driver;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
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
                ", модель - " + model + ", объём двигателя - " + engineVolume + ", ответственный за обслуживание" + mechanicList;
    }

    abstract void startMovingAuto ();
    abstract void finishMovingAuto ();
    public abstract void printType();
    public abstract String repair();
    abstract String passDiagnostics () throws TransportTypeException;
    public boolean checkTransportNeedService (){
        try {
            passDiagnostics();
        } catch (TransportTypeException e){
            return false;
        }
        return true;
    }

    }

