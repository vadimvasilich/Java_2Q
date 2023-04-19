package ДЗ_семинар1;

/*
 * Вывести все простые числа от 1 до 1000 (которые делятся только на себя и на единицу)
 */


// import java.util.ArrayList;
// import java.util.List;

public class Task03 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1001; i++) {
            // поставили флаг
            boolean isPrime = true;  
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++){
                //Если j - делитель, флаг = false
                if ((i % j) == 0) { 
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " "); //если делителей нет, флаг остался True, число на печать
            }
        }
    }
}


/* 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int input = scanner.nextInt();
        scanner.close();
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= input; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);
    }
}
*/