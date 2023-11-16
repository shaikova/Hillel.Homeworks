package Homework2;

public class Salary {
    public static void main(String[] args) {
        double hoursPerWeek = Double.parseDouble(args[0]);
        double hourlyRate = Double.parseDouble(args[1]);
        double taxPercentage = Double.parseDouble(args[2]);

        double monthlySalaryWithoutTax = hoursPerWeek * hourlyRate * 4; // Зарплатня на місяць без податків
        double monthlyTax = (monthlySalaryWithoutTax * taxPercentage) / 100; // Сума податку на місяць
        double monthlySalaryWithTax = monthlySalaryWithoutTax - monthlyTax; // Зарплатня на місяць з податками

        double annualSalaryWithoutTax = monthlySalaryWithoutTax * 12; // Зарплатня на рік без податків
        double annualTax = monthlyTax * 12; // Сума податку на рік
        double annualSalaryWithTax = annualSalaryWithoutTax - annualTax; // Зарплатня на рік з податками

        System.out.println("Зарплатня на місяць без податків: " + monthlySalaryWithoutTax);
        System.out.println("Зарплатня на місяць з податками: " + monthlySalaryWithTax);
        System.out.println("Зарплатня на рік без податків: " + annualSalaryWithoutTax);
        System.out.println("Зарплатня на рік з податками: " + annualSalaryWithTax);
    }
}
