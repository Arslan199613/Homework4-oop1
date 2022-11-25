package Drivers;

import Car.Buses;

public class DriverD <D extends Buses> extends Driver {
    public DriverD(String fullName, String driverLicence, double experience) {
        super(fullName, driverLicence, experience);

    }

    @Override
    public void startMoving() {
        System.out.printf("Водитель автобуса %s стартует.\n",getFullName());
    }

    @Override
    public void refuelAuto() {
        System.out.printf("Водитель автобуса %s заправляется.\n",getFullName());
    }

    @Override
    public void finishTheMovement() {
        System.out.printf("Водитель автобуса %s тормозит.\n",getFullName());

    }

    public void driverInfo(D buses) {
        System.out.printf("Водитель %s, управляет автомобилем %s %s и будет участвовать в заезде.\n", getFullName(), buses.getBrand(), buses.getModel());
    }
}