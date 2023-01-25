package transport;

public class Bus <DriverD> extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    void finishMoving() {
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
