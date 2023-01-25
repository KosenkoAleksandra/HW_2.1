package transport;

public class Car extends Transport implements Competing {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMoving() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " начал движение");}

    @Override
    void finishMoving() {
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
