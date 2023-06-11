package Seminar3;

public class Worker extends Employee {

    public Worker(String name, String surname, Integer age, Integer salary) {
        super(name, surname, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, age, calculateSalary());
    }
}