package ДЗ_семинар3;

/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
 */

import java.util.ArrayList;
import java.util.Collections;

 public class Task02 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(11);
        lst.add(22);
        lst.add(33);
        lst.add(44);
        
        int minValue = Collections.min(lst);
        int maxValue = Collections.max(lst);
        
        int sum = 0;
        for (Integer value : lst) {
        sum += value;
        }
        
        double avgValue = (double) sum / lst.size();
        
        System.out.println("Минимальное значение: " + minValue);
        System.out.println("Максимальное значение: " + maxValue);
        System.out.println("Среднее арифметическое: " + avgValue);
        }
}
