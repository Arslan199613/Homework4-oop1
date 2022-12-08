package Car;

public class Mechanic <T extends Car>{
    private String name;
    private String surname;
    private String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public void service(T t) {
        t.service();
    }

    public void repair(T t) {
        t.repair();
    }

    @Override
    public String toString() {
        return name + " " + surname + " из " + company;
    }
}
