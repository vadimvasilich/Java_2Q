package Seminar3;

import java.util.Comparator;

public class AgeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        int age1 = e1.getAge();
        int age2 = e2.getAge();
        if (age1 > age2) {
            return 1;

        } else {
            if (age1 < age2) {
                return -1;

            } else {
                double salary1 = e1.getSalary();
                double salary2 = e2.getSalary();
                
                if (salary1 > salary2) {
                    return 1;

                } else {
                    if (salary1 < salary2) {
                        return -1;

                    } else {
                        return 0;
                    }
                }
            }
        }   
    }
}
