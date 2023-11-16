package Homework4;

import java.util.Scanner;

public class NumberInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        // парне/непарне
        if (number % 2 == 0) {
            System.out.println("Число " + number + " є парним.");
        } else {
            System.out.println("Число " + number + " є непарним.");
        }

        // додатнє/від'ємне
        if (number > 0) {
            System.out.println("Число " + number + " є додатнім.");
        } else if (number < 0) {
            System.out.println("Число " + number + " є від'ємним.");
        } else {
            System.out.println("Число " + number + " дорівнює нулю.");
        }

        // просте/складене
        if (isPrime(number)) {
            System.out.println("Число " + number + " є простим.");
        } else {
            System.out.println("Число " + number + " є складеним.");
        }
    }
    // Метод для визначення, чи є число простим
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
