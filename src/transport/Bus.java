package transport;

import java.util.List;

public class Bus extends Transport <DriverD> implements Competing {
    private BusCapacity busCapacity;
    public Bus(DriverD driver,
               String brand,
               String model,
               double engineVolume,
               List<Mechanic> mechanicList,
               BusCapacity busCapacity) {
        super(driver, brand, model, engineVolume, mechanicList);
        this.busCapacity= busCapacity;
    }

    public BusCapacity getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(BusCapacity busCapacity) {
        this.busCapacity = busCapacity;
    }

    @Override
    void startMovingAuto() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    void finishMovingAuto() {
        System.out.println("Автобус " + getBrand() + " " + getModel() +  " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для автобуса "  + getBrand() + " " + getModel());
    }

    @Override
    public void theBestLapTime() {
        System.out.println("Лучшее время круга для автобуса "  + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса "  + getBrand() + " " + getModel());
    }

    @Override
    public void printType() {
            if (getBusCapacity() == null) {
                System.out.println("Данных по транспортному средству недостаточно");
            } else {
                System.out.println(getBusCapacity());
            }
    }

    @Override
    String passDiagnostics() throws TransportTypeException {
        throw new TransportTypeException("Автобусы проходить диагностику не должны");

    }

    @Override
    public String repair() {
        return "Ремонт автобуса";
    }

}
