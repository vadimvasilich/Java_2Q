package Seminar3;

public class Freelancer extends Employee {

    public Freelancer(String name, String surname, Integer age, Integer salary) {
        super(name, surname, age, salary);
    }


    @Override
    public double calculateSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return String.format("%s %s; Среднемесячная заработная плата: %.2f (руб.)",
                surname, name, age, calculateSalary());
    }
}