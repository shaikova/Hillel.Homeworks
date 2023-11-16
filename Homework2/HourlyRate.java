package Homework2;

import java.util.Scanner;
public class HourlyRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість робочих годин на тиждень: ");
        double hoursPerWeek = scanner.nextDouble();

        System.out.print("Введіть річну зарплату з податками: ");
        double annualSalaryWithTax = scanner.nextDouble();

        System.out.print("Введіть відсоток податку: ");
        double taxPercentage = scanner.nextDouble();

        // Розрахунок місячної зарплати з податками та податку на рік
        double monthlySalaryWithTax = annualSalaryWithTax / 12;
        double monthlyTax = (monthlySalaryWithTax * taxPercentage) / 100;

        // Розрахунок місячної зарплати без податків
        double monthlySalaryWithoutTax = monthlySalaryWithTax - monthlyTax;

        // Розрахунок вартості години часу без податку
        double hourlyRate = monthlySalaryWithoutTax / (hoursPerWeek * 4);

        System.out.println("При " + hoursPerWeek + " робочих годин на тиждень з річною зарплатою в " +
                annualSalaryWithTax + " та податком " + taxPercentage + "%");
        System.out.println("година часу коштує " + hourlyRate);

        scanner.close();
    }
}