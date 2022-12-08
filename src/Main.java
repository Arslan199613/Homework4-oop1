
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> driver = new HashSet<>();
        driver.add("Сергей");
        driver.add("Андрей");
        driver.add("Иван");
        driver.add("Василий");
        driver.add("Александр");

        if (driver.contains("Анжелла")) {
            System.out.println("У имен водителей есть повтор");
        } else {
            System.out.println("у имен водителей нет повтора");
        }

        Set<String> mechanics = new HashSet<>();
        mechanics.add("Сергей");
        mechanics.add("Дмитрий");
        mechanics.add("Булат");
        if (mechanics.contains("Булат")) {
            System.out.println("Имя не должно повторяться");
        }
        System.out.println("Спонсоры");
        Set<String> sponsors = new HashSet<>();
        sponsors.add("Газпром");
        sponsors.add("Билайн");
        sponsors.add("Мегафон");

        if (sponsors.contains("Мегафон")) {
            System.out.println("Такой спонсор есть в списке,  не должен повторяться");
        }

        Set<String> cars = new HashSet<>();
        cars.add("Ауди");
        cars.add("БМВ");
        cars.add("Хонда");

        if (sponsors.contains("Хонда")) {
            System.out.println("Такой автомобиль есть в списке,  не должен повторяться");
        }
    }
}

