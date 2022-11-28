package Car;

public class Buses extends Car implements Competing{
    private TypeCapacity typeCapacity;
    public Buses(String brand, String model, double engineCapacity,TypeCapacity typeCapacity) {
        super(brand, model, engineCapacity);
        this.typeCapacity = typeCapacity;
    }

    public TypeCapacity getTypeCapacity() {
        return typeCapacity;
    }

    @Override
    public void PrintType() {
        if (typeCapacity == null) {
            System.out.println("Данных по автобусу недостаточно");
        } else {
            System.out.println("Тип кузова автобуса- " + typeCapacity+":"+typeCapacity.getFrom()+"-"+typeCapacity.getTo());
        }
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
