package Car;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ServiceStation {
    private Set<Car> cars = new HashSet<>();

    private void add(Car car) {
        cars.add(car);
    }

    public void addPassenger(Passenger passenger) {
        add(passenger);
    }

    public void addTruck(Truck truck) {
        add(truck);
    }
}
