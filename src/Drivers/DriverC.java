package Drivers;


import Car.Truck;
public class DriverC <C extends Truck> extends Driver {


    public DriverC(String fullName, String driverLicence, double experience) {
        super(fullName, driverLicence, experience);
    }

    @Override
    public void startMoving() {
        System.out.printf("Водитель грузовика %s стартует.\n", getFullName());

    }

    @Override
    public void refuelAuto() {
        System.out.printf("Водитель грузовика %s  заправляется.\n", getFullName());
    }

    @Override
    public void finishTheMovement() {
        System.out.printf("Водитель грузовика %s  тормозит.\n", getFullName());
    }
    public void driverInfo(C truck) {
        System.out.printf("Водитель %s, управляет автомобилем %s %s и будет участвовать в заезде.\n", getFullName(), truck.getBrand(), truck.getModel());
    }
}
