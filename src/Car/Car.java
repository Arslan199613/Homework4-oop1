package Car;

import java.util.Objects;

public abstract class Car {
    private String brand;
    private String model;
    private double engineCapacity;

    public Car(String brand, String model, double engineCapacity) {
        if (!(brand ==null) && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }else{
            this.brand = "Лада";
        }
        if (!(model == null) && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }else{
            this.model = "Ларгус";
        }
        if (engineCapacity < 0) {
            this.engineCapacity = 2.0;
        }else {
            this.engineCapacity = engineCapacity;
        }
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (!(brand == null) && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "Лада";
        }
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!(model == null) && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "Ларгус";
        }
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if (engineCapacity < 0) {
            this.engineCapacity = 2.0;
        } else {
            this.engineCapacity = engineCapacity;
        }
    }
    public abstract void finishTheMovement();
    public abstract void startMoving();

    @Override
    public String toString() {
        return "Транпорт- "+ brand + ", модель- " + model + ", объем двигателя- "+ engineCapacity;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineCapacity, engineCapacity) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineCapacity);
    }

}

