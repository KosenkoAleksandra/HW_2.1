package transport;

import java.util.Objects;

public class Mechanic {
    public String nameMechanic;
    public String surnameMechanic;
    public final String placeOfWork;

    public Mechanic(String nameMechanic, String surnameMechanic, String placeOfWork) {
        this.nameMechanic = ValidateUtils.validateString(nameMechanic, "default");
        this.surnameMechanic = ValidateUtils.validateString(surnameMechanic, "default");
        this.placeOfWork = ValidateUtils.validateString(placeOfWork, "default");
    }

    public String getNameMechanic() {
        return nameMechanic;
    }

    public void setNameMechanic(String nameMechanic) {
        this.nameMechanic = ValidateUtils.validateString(nameMechanic, "default");
    }

    public String getSurnameMechanic() {
        return surnameMechanic;
    }

    public void setSurnameMechanic(String surnameMechanic) {
        this.surnameMechanic = ValidateUtils.validateString(surnameMechanic, "default");
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public <T extends Transport> void toDiagnose(T t) {
            System.out.println(t.passDiagnostics() + ", проводил диагностику " + this);
    }
    public <T extends Transport> void fixTheCar(T t){
        System.out.println(t.repair() + ", ответственный за обслуживание " + this);
    }

    @Override
    public String toString() {
        return "" + nameMechanic + " " + surnameMechanic + ", место работы " + placeOfWork;
    }

}
