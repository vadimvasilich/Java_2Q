package ДЗ_семинар4;


/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. 
 * Постараться не обращаться к листу по индексам.
 */

import java.util.LinkedList;

public class Task01 {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            lst.add(getRandomNumber());
        }
        System.out.println(lst);

        for (int i = 0; i < 10; i++) {
            System.out.print(lst.getLast() + ", ");
            lst.removeLast();

        }
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 100);
        int num = (int) x;
        return num;
    }
}
