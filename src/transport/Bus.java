package transport;

public class Bus extends Transport implements Competing {
    public Bus(DriverD driver, String brand, String model, double engineVolume) {
        super(driver, brand, model, engineVolume);
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

}
