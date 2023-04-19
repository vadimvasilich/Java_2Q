package ДЗ_семинар1;

/*
 * Реализовать простой калькулятор
 */
import java.util.Scanner;

public class Task04 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Введите первое число:");
        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();
        
        System.out.println("Введите второе число:");
        Scanner b = new Scanner(System.in);
        int num2 = b.nextInt();

        System.out.println("Введите операцию:");
        char operation = scanner.next().charAt(0);

        int result = 0;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            }
    System.out.println("Результат операции: " + result);
    a.close();
    b.close();
    }
}