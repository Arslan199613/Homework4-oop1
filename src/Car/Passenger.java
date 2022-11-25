package Car;

public class Passenger extends Car implements Competing{
    public Passenger(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Легковушка остановилась");

    }

    @Override
    public void startMoving() {
        System.out.println("Легковушка поехала");

    }

    @Override
    public String getPitStop() {
        return "Легковушка останавливается для заправки топливом";
    }

    @Override
    public double getBestTime() {
        return  1.5;
    }

    @Override
    public double getMaxSpeed() {
        return 200;
    }
}
