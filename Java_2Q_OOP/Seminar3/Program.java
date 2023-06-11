package Seminar3;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    public static Employee generateEmployee(){
        String[] freelancerNames = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен",
         "Клим", "Панкратий", "Рубен", "Герман" };
        String[] freelancerSurnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", 
        "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        String[] workerNames = new String[] {"Вася", "Петя", "Федя"};
        String[] workerSurnames = new String[] {"Иванов", "Петров", "Сидоров"};
        int age = random.nextInt(20, 60);
        int salary = random.nextInt(20000, 80000);

        if (random.nextBoolean()) {
            return new Worker(workerNames[random.nextInt(workerNames.length)], 
            workerSurnames[random.nextInt(workerSurnames.length)], age, salary);
        } else {
            return new Freelancer(freelancerNames[random.nextInt(freelancerNames.length)], 
            freelancerSurnames[random.nextInt(freelancerSurnames.length)], age, salary);
        }
    }


    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *   Придумать несколько Comparator'ов для сортировки сотрудников
     *   по фамилии + имени или по возрасту + уровню зп.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++)
        {
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees);

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}
