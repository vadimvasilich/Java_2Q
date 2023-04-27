package ДЗ_семинар4;

/*
 * Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
 */

import java.util.Iterator;
import java.util.LinkedList;

public class Task03 {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(7);
        num.add(2);
        num.add(6);
        num.add(1);

        
        Iterator<Integer> iterator = num.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        
        System.out.println(" Сумма элементов списка равна: " + sum);
    }
}
