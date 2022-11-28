package Drivers;


import Car.Passenger;
public class DriverB<B extends Passenger> extends Driver {

    public DriverB(String fullName, String driverLicence, double experience) {
        super(fullName, driverLicence, experience);
    }

    @Override
    public void finishTheMovement() {
        System.out.printf("Водитель легковушки %s  тормозит.\n", getFullName());
    }

    @Override
    public void startMoving() {

        System.out.printf("Водитель %s легковушки разгоняется.\n", getFullName());

    }

    @Override
    public void refuelAuto() {
        System.out.printf("Водитель легковушки %s заправляется.\n", getFullName());
    }

    public void driverInfo(B passenger) {
        System.out.printf("Водитель %s, управляет автомобилем %s %s и будет участвовать в заезде.\n", getFullName(), passenger.getBrand(), passenger.getModel());

    }

}





