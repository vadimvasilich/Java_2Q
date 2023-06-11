package Seminar3;


public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surname;
    protected Integer age;
    protected Integer salary; // Ставка заработной платы

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    public Employee(String name, String surname, Integer age, Integer salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int res = name.compareTo(o.name);
        if (res == 0){
            return Double.compare(calculateSalary(), o.calculateSalary());
        }
        return res;
    }
}
