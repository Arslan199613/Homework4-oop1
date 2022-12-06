import Car.*;
;
import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;

import java.util.List;

public class Main {
    public static void main(String[] args) {





        Mechanic<Truck> petr = new Mechanic<Truck>("Петр", "Иванов", "Pirelli");
        Mechanic<Car> aleksey = new Mechanic<Car>("Алексей", "Иванов", "Pirelli");

        Sponsor lucoil = new Sponsor("Лукойл", 2_000_000);
        Sponsor michelin = new Sponsor("Michelin", 3_000_000);

        Truck truck1 = new Truck("Volvo", "FL7", 3.0, TypeLoadCapacity.N1);
        truck1.addDriver(new DriverC<>("Антонов Антон Александрович", "есть", 11));
        truck1.addMechanic(petr);
        truck1.addSponsor(lucoil,michelin);

        Passenger passenger = new Passenger("Лада", "Гранта", 1.6, BodyType.SEDAN);
        passenger.addDriver(new DriverB<>("Иванов Алексей Иванович", "есть", 11));
        passenger.addMechanic(aleksey);
        passenger.addSponsor(michelin);

        Buses bus1 = new Buses("Автобус 1", "Большой", 1.8, TypeCapacity.LARGE);
        bus1.addDriver(new DriverD<>("Семёнов Олег Артемович", "есть", 5));
        bus1.addMechanic(aleksey);
        bus1.addSponsor(lucoil);


        DriverB<Passenger> sergeev = new DriverB<>("Сергеев Иван Романович", "есть", 12);
        DriverB<Passenger> ivanov = new DriverB<>("Иванов Дмитрий Иванович", "есть", 11);

        DriverC<Truck> antonov = new DriverC<>("Антонов Антон Александрович", "есть", 11);
        DriverC<Truck> vladimirov = new DriverC<>("Владимиров Олег Артемович", "есть", 9);

        DriverD<Buses> semenov = new DriverD<>("Семёнов Олег Артемович", "есть", 5);
        DriverD<Buses> aldonin = new DriverD<>("Алдонин Олег Артемович", "есть", 7);

        List<Car> cars = List.of(passenger, truck1, bus1);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addPassenger(passenger);
        serviceStation.addTruck(truck1);

        serviceStation.service();
        serviceStation.service();



        for (Car car : cars) {
            printInfo(car);


        }
    }

    private static void printInfo(Car car) {
        System.out.println("Информация по автомобилю " + car.getBrand() + " " + car.getModel());
        System.out.println("Водители:" + car.getDrivers());
        System.out.println("Спонсоры:" + car.getSponsors());
        System.out.println("Механики:" + car.getMechanics());
        System.out.println();
    }
    private static void service(Car... cars) {
        for (Car car : cars) {
            serviceCar(car);
        }
    }

    private static void serviceCar(Car car) {
        try {
            if (!car.service()) {
                throw new RuntimeException("Автомобиль " + car.getBrand() +
                        " " + car.getModel() + " не прошел диагностику ");
            }
            } catch(RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
        public static void printInfoTrucks (Truck truck){
            System.out.println("Пит-Стоп-" + truck.getPitStop() +
                    ", лучшее время круга-" + truck.getBestTime() + " часа" +
                    ",максимальная скорость-" + truck.getMaxSpeed());
        }

        public static void printInfoPassengers (Passenger passenger){
            System.out.println("Пит-Стоп-" + passenger.getPitStop() +
                    ", лучшее время круга-" + passenger.getBestTime() + " часа " +
                    ",максимальная скорость-" + passenger.getMaxSpeed());
        }

        public static void printInfoBuses (Buses buses){
            System.out.println("Пит-Стоп-" + buses.getPitStop() +
                    ", лучшее время круга-" + buses.getBestTime() + " часа" +
                    ",максимальная скорость-" + buses.getMaxSpeed());
        }

    }

