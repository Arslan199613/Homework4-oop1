package Car;

public class Truck extends Car implements Competing{
    public Truck(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Грузовик остановился");

    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик поехал");
    }


    @Override
    public String getPitStop() {
        return "Грузовик останавливается для смены шин";
    }

    @Override
    public double getBestTime() {
        return 1.5;
    }

    @Override
    public double getMaxSpeed() {
        return 180;
    }
}


