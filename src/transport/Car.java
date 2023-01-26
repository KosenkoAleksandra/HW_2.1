package transport;

import static transport.ValidateUtils.validateCarParameters;
import static transport.ValidateUtils.validateEngineVolume;

public class Car  extends Transport implements Competing {
    public Car(DriverB driver, String brand, String model, double engineVolume) {
        super(driver, brand, model, engineVolume);
    }

    @Override
    void startMovingAuto() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " начал движение");}

    @Override
    void finishMovingAuto() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для легкового автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public void theBestLapTime() {
        System.out.println("Лучшее время круга для легкового автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость легкового автомобиля " + getBrand() + " " + getModel());
    }


}
