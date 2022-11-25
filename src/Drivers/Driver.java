package Drivers;

import Car.Car;

public abstract class Driver {
    private String fullName;
    private String driverLicence;
    private double experience;

    public Driver(String fullName, String driverLicence, double experience) {
        this.fullName = fullName;
        this.driverLicence = driverLicence;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(String driverLicence) {
        this.driverLicence = driverLicence;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public abstract void startMoving();

    public abstract void refuelAuto();

    public abstract void finishTheMovement();

    @Override
    public String toString() {
        return "Водитель:"+ fullName  + ", наличие прав: "+ driverLicence + ", со стажем-"+ experience;
    }
}


