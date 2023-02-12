package transport;

import java.util.Objects;

public abstract class Driver {
    public String fullName;
    public boolean hasDriverLicense;
    public int drivingExperienceInYears;

    public Driver(String fullName, boolean hasDriverLicense, int drivingExperienceInYears) {
        this.fullName = fullName;
        this.hasDriverLicense = hasDriverLicense;
        this.drivingExperienceInYears = drivingExperienceInYears;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getDrivingExperienceInYears() {
        return drivingExperienceInYears;
    }

    public void setDrivingExperienceInYears(int drivingExperienceInYears) {
        this.drivingExperienceInYears = drivingExperienceInYears;
    }

    @Override
    public String toString() {
        return " " + fullName + ", имеющий водительское удостоверение " + hasDriverLicense +
                ", со стажем вождения " + drivingExperienceInYears + " лет ";
    }

    public abstract void startMoving();
    public abstract void finishMoving();
    public abstract void refuelTheCar();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return hasDriverLicense == driver.hasDriverLicense && drivingExperienceInYears == driver.drivingExperienceInYears && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, hasDriverLicense, drivingExperienceInYears);
    }
}
