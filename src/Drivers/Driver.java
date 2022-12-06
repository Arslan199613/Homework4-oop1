package Drivers;

import Car.Car;
import jdk.jfr.Category;

public abstract class Driver<C extends Category> {
    private String fullName;
    private String driverLicence;
    private double experience;
    private C category;

    public Driver(String fullName, String driverLicence, double experience) {
        this.fullName = fullName;
        this.driverLicence = driverLicence;
        this.experience = experience;
    }

    public Driver(String fullName, String driverLicence, double experience, C category) {
        this.fullName = fullName;
        this.driverLicence = driverLicence;
        this.experience = experience;
        setCategory(category);
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

    public C getCategory() {
        return category;
    }

    public void setCategory(C category) {
        if (category == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав!");

        }
        this.category = category;
    }

    public abstract void startMoving();

    public abstract void refuelAuto();

    public abstract void finishTheMovement();

    @Override
    public String toString() {
        return fullName + ", наличие прав: " + driverLicence + ", со стажем-" + experience;
    }
}


