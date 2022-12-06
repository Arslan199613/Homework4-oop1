package Car;

public class Passenger extends Car implements Competing {
    private BodyType bodyType;


    public Passenger(String brand, String model, double engineCapacity, BodyType bodyType) {
        super(brand, model, engineCapacity);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public double getMaxSpeed() {
        return 200;
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
    public boolean passDiagnostics() {
        return Math.random() > 0.;
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " починена!");
    }

    @Override
    public String getPitStop() {
        return "Легковушка останавливается для заправки топливом";
    }

    @Override
    public double getBestTime() {
        return 1.5;
    }
    @Override
    public void PrintType() {
        if (bodyType == null) {
            System.out.println("Данных по легковушке недостаточно");
        }else {
            System.out.println("Тип кузова авто- "+ bodyType);
        }
    }
}
