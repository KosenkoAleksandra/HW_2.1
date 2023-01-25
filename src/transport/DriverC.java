package transport;

public class DriverC extends Driver {

    public DriverC(String fullName, boolean hasDriverLicense, int drivingExperienceInYears) {
        super(fullName, hasDriverLicense, drivingExperienceInYears);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории C " + getFullName() + " начал движение.");
    }

    @Override
    public void finishMoving() {
        System.out.println("Водитель категории C " + getFullName() + " закончил движение.");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Водитель категории C " + getFullName() + " заправляет грузовой автомобиль.");
    }
    @Override
    public String toString() {
        return "C " + fullName + ", имеющий водительское удостоверение " + hasDriverLicense +
                ", со стажем вождения " + drivingExperienceInYears + " лет ";
    }
}
