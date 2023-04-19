package ДЗ_семинар1;
/*
 * task1
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n)
 */


import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = Scanner.nextInt();

        System.out.printf("Треугольное число: %d\n", sumNumber(num));

        Scanner.close();
    }

    public static int sumNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}