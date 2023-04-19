package ДЗ_семинар1;

/*
 * Вывести все простые числа от 1 до 1000 (которые делятся только на себя и на единицу)
 */


public class Task03 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1001; i++) {
            boolean isPrimeNumber = true;   // поставили флаг
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++){
                if ((i % j) == 0) { //Если j - делитель, флаг = false
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber){
                System.out.print(i + " "); //если делителей нет, флаг остался True, число на печать
            }
        }
    }
}