package transport;

public class Truck extends Transport <DriverC> implements Competing {
    public Truck(DriverC driver, String brand, String model, double engineVolume) {
        super(driver, brand, model, engineVolume);
    }

    @Override
    void startMovingAuto() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    void finishMovingAuto() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для грузового автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public void theBestLapTime() {
        System.out.println("Лучшее время круга для грузового автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузового автомобиля " + getBrand() + " " + getModel());
    }


}
