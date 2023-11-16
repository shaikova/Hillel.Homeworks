package Homework3;

import java.util.Scanner;

public class Credit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть загальну суму кредиту:");
        double loanAmount = scanner.nextDouble();

        System.out.println("Введіть місячний відсоток на залишок по кредиту (у відсотках, наприклад, 1.5):");
        double monthlyInterestRate = scanner.nextDouble() / 100.0;

        System.out.println("Оберіть опцію:");
        System.out.println("1 - Розрахувати кількість щомісячних платежів");
        System.out.println("2 - Розрахувати суму щомісячного платежу");
        int option = scanner.nextInt();

        if (option == 1) {
            System.out.println("Введіть суму щомісячного внеску:");
            double monthlyPayment = scanner.nextDouble();
            calculateNumberOfPayments(loanAmount, monthlyInterestRate, monthlyPayment);
        } else if (option == 2) {
            System.out.println("Введіть кількість платежів:");
            int numberOfPayments = scanner.nextInt();
            calculateMonthlyPayment(loanAmount, monthlyInterestRate, numberOfPayments);
        } else {
            System.out.println("Невірна опція.");
        }
    }

    public static void calculateNumberOfPayments(double loanAmount, double monthlyInterestRate, double monthlyPayment) {
        int numberOfPayments = 0;
        while (loanAmount > 0) {
            double interest = loanAmount * monthlyInterestRate;
            loanAmount += interest;
            loanAmount -= monthlyPayment;
            numberOfPayments++;
        }
        System.out.println("Кількість щомісячних платежів: " + numberOfPayments);
    }

    public static void calculateMonthlyPayment(double loanAmount, double monthlyInterestRate, int numberOfPayments) {
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        System.out.println("Сума щомісячного платежу: " + monthlyPayment);
    }
}
