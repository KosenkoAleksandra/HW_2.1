package transport;

public class Truck extends Transport <DriverC> implements Competing {
    private LoadType loadType;
    public Truck(DriverC driver, String brand, String model, double engineVolume, LoadType loadType) {
        super(driver, brand, model, engineVolume);
        this.loadType = loadType;
    }

    public LoadType getLoadType() {
        return loadType;
    }

    public void setLoadType(LoadType loadType) {
        this.loadType = loadType;
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

    @Override
    public void printType() {
            if (getLoadType() == null) {
                System.out.println("Данных по транспортному средству недостаточно");
            } else {
                System.out.println(getLoadType());
            }
    }
}
