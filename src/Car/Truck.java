package Car;

public class Truck extends Car implements Competing{

    private TypeLoadCapacity typeLoadCapacity;
    public Truck(String brand, String model, double engineCapacity,TypeLoadCapacity typeLoadCapacity) {
        super(brand, model, engineCapacity);
        this.typeLoadCapacity = typeLoadCapacity;

    }

    @Override
    public void finishTheMovement() {
        System.out.println("Грузовик остановился");

    }

    @Override
    public void PrintType() {
        if (typeLoadCapacity == null) {
            System.out.println("Данных по грузовику недостаточно");
        } else {
            System.out.println("Тип кузова автобуса- " + typeLoadCapacity+":"+typeLoadCapacity.getFrom()+"-"+typeLoadCapacity.getTo());
        }
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


