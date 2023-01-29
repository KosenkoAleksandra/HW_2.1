package transport;

import static transport.ValidateUtils.validateCarParameters;
import static transport.ValidateUtils.validateEngineVolume;

public class Car  extends Transport <DriverB> implements Competing {
    private BodyType bodyType;
    public Car(DriverB driver, String brand, String model, double engineVolume, BodyType bodyType) {
        super(driver, brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
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
    @Override
    public void printType(){
        if (getBodyType() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getBodyType());
        }
    }
}
