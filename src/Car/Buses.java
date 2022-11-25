package Car;

public class Buses extends Car implements Competing{
    public Buses(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Автобус, заканчивай движения");

    }

    @Override
    public void startMoving() {
        System.out.println("Автобус, начинай движение");

    }

    @Override
    public String getPitStop() {
        return "Автобус остановливается для проверки технического состояния";
    }

    @Override
    public double getBestTime() {
        return 1.2;
    }

    @Override
    public double getMaxSpeed() {
        return 170;
    }
}
