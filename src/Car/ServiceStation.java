package Car;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Car> cars = new LinkedList<>();

    private void add(Car car) {
        cars.offer(car);
    }

    public void addPassenger(Passenger passenger) {
        add(passenger);
    }

    public void addTruck(Truck truck) {
        add(truck);
    }

    public void service() {
        if (!cars.isEmpty()) {
            Car car = cars.poll();
            boolean result = car.service();
            if (!result) {
                car.repair();
            }

        }
    }
}