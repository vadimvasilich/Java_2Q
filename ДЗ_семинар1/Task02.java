package ДЗ_семинар1;
/*
 * Вычислить n!
 */

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int num = Scanner.nextInt();

        System.out.printf("Факториал n: %d\n", multNumber(num));

        Scanner.close();
    }


    public static int multNumber(int n) {
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            mult *= i; 
        }
    return mult;
    }
}

