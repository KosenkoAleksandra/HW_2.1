package transport;

public class DriverB extends Driver {
    public DriverB(String fullName, boolean hasDriverLicense, int drivingExperienceInYears) {
        super(fullName, hasDriverLicense, drivingExperienceInYears);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории В " + getFullName() + " начал движение.");
    }

    @Override
    public void finishMoving() {
        System.out.println("Водитель категории В " + getFullName() + " закончил движение.");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Водитель категории В " + getFullName() + " заправляет легковой автомобиль.");
    }

    @Override
    public String toString() {
        return "категории B " + fullName + ", имеющий водительское удостоверение " + hasDriverLicense +
                ", со стажем вождения " + drivingExperienceInYears + " лет ";
    }
}
