import Car.Buses;
import Car.Passenger;
import Car.Truck;;
import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;

public class Main {
    public static void main(String[] args) {

        Truck truck1 = new Truck("Volvo", "FL7", 3.0);
        Truck truck2 = new Truck("Грузовик 1", "Большой", 3.0);
        Truck truck3 = new Truck("Грузовик 2", "Огромный", 3.0);
        Truck truck4 = new Truck("Грузовик 3", "Средний", 3.0);

        Passenger car1 = new Passenger("Лада", "Гранта", 1.6);
        Passenger car2 = new Passenger("Рено", "Логан", 1.8);
        Passenger car3 = new Passenger("Хонда", "Цивик", 1.6);
        Passenger car4 = new Passenger("Рено", "Каптур", 1.6);

        Buses bus1 = new Buses("Автобус 1", "Большой", 1.8);
        Buses bus2 = new Buses("Автобус 2", "Средний", 1.6);
        Buses bus3 = new Buses("Автобус 3", "Маленький", 2.0);
        Buses bus4 = new Buses("Автобус 3", "Красный", 1.8);

        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);

        System.out.println("Интерфейсы-3 домашнее задание");
        System.out.println();
        printInfoTrucks(truck1);
        printInfoTrucks(truck2);
        printInfoTrucks(truck3);
        printInfoTrucks(truck4);
        System.out.println();
        printInfoPassengers(car1);
        printInfoPassengers(car2);
        printInfoPassengers(car3);
        printInfoPassengers(car4);
        System.out.println();
        printInfoBuses(bus1);
        printInfoBuses(bus2);
        printInfoBuses(bus3);
        printInfoBuses(bus4);

        System.out.println();
        DriverB<Passenger> sergeev = new DriverB<>("Сергеев Иван Романович","есть",12);
        DriverB<Passenger> ivanov = new DriverB<>("Иванов Дмитрий Иванович","есть",11);
        sergeev.driverInfo(car1);
        ivanov.driverInfo(car2);
        DriverC<Truck> antonov = new DriverC<>("Антонов Антон Александрович", "есть", 11);
        DriverC<Truck> vladimirov = new DriverC<>("Владимиров Олег Артемович", "есть", 9);
        System.out.println();
        antonov.driverInfo(truck1);
        vladimirov.driverInfo(truck2);
        System.out.println();
        DriverD<Buses> semenov = new DriverD<>("Семёнов Олег Артемович", "есть", 5);
        DriverD<Buses> aldonin = new DriverD<>("Алдонин Олег Артемович", "есть", 7);


        semenov.driverInfo(bus1);
        aldonin.driverInfo(bus1);

        sergeev.startMoving();
        ivanov.startMoving();

        aldonin.startMoving();
        semenov.finishTheMovement();


    }

    public static void printInfoTrucks(Truck truck) {
        System.out.println("Пит-Стоп-" + truck.getPitStop() +
                ", лучшее время круга-" + truck.getBestTime() + " часа" +
                ",максимальная скорость-" + truck.getMaxSpeed());
    }

    public static void printInfoPassengers(Passenger passenger) {
        System.out.println("Пит-Стоп-" + passenger.getPitStop() +
                ", лучшее время круга-" + passenger.getBestTime() + " часа " +
                ",максимальная скорость-" + passenger.getMaxSpeed());
    }

    public static void printInfoBuses(Buses buses) {
        System.out.println("Пит-Стоп-" + buses.getPitStop() +
                ", лучшее время круга-" + buses.getBestTime() + " часа" +
                ",максимальная скорость-" + buses.getMaxSpeed());
    }

}