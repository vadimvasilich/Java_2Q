package ДЗ_семинар3;

/*
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */

import java.util.ArrayList;
import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
        int val = rnd.nextInt(-100, 100);
        lst.add(val);
               }
        System.out.printf("Исходный список %s\n", lst);
        int i = 0;
        while (i < lst.size()) {
        if (lst.get(i) % 2 == 0) {
        lst.remove(i);
                   }
        else {
        i++;
                   }
               }
        System.out.printf("Список с удаленными четными числами %s", lst);
           }
    
}
