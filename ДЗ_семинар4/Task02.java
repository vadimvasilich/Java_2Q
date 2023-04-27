package ДЗ_семинар4;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами: 
 * enqueue() - помещает элемент в конец очереди, 
 * dequeue() - возвращает первый элемент из очереди и удаляет его, 
 * first() - возвращает первый элемент из очереди, не удаляя.
 */

import java.util.LinkedList;
public class Task02 {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(lst, getRandomNumber()); //заполняем случайными числами
        }
        System.out.println(lst);

        System.out.println(dequeue(lst)); // удалили первый элемент
        System.out.println(lst);

        System.out.println(first(lst)); // вывели первый элемент
        System.out.println(lst); 
    }

    public static void enqueue(LinkedList<Integer> lst, int num) {// помещает элемент в конец очереди
        lst.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> lst) { // возвращает первый элемент из очереди и удаляет его
        int num = lst.get(0);
        lst.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> lst) { // возвращает первый элемент из очереди, не удаляя
        int num = lst.get(0);
        return num;
    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 100);
        int num = (int) x;
        return num;
    }
}
