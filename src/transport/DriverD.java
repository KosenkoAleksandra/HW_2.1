package transport;

public class DriverD extends Driver {

    public DriverD(String fullName, boolean hasDriverLicense, int drivingExperienceInYears) {
        super(fullName, hasDriverLicense, drivingExperienceInYears);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории D " + getFullName() + " начал движение.");

    }

    @Override
    public void finishMoving() {
        System.out.println("Водитель категории D " + getFullName() + " закончил движение.");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Водитель категории D " + getFullName() + " заправляет автобус.");
    }
    @Override
    public String toString() {
        return "D " + fullName + ", имеющий водительское удостоверение " + hasDriverLicense +
                ", со стажем вождения " + drivingExperienceInYears + " лет ";
    }
}
