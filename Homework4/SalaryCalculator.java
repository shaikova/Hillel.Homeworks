package Homework4;

public class SalaryCalculator {
    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);
        double hourlyRate = Double.parseDouble(args[1]);
        double taxPercentage = Double.parseDouble(args[2]);

        int daysInMonth = getDaysInMonth(month);
        int workingDays = getWorkingDays(daysInMonth);

        double grossSalary = workingDays * 8 * hourlyRate;
        double netSalary = grossSalary - (grossSalary * (taxPercentage / 100));

        System.out.println("Зарплатня за місяць (без податку): " + grossSalary);
        System.out.println("Зарплатня за місяць (з податком " + taxPercentage + "%): " + netSalary);
    }

    // Метод для отримання кількості днів у місяці
    public static int getDaysInMonth(int month) {
        if (month < 1 || month > 12) {
            return 0; // Недійсний номер місяця
        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[month - 1];
    }

    // Метод для отримання кількості робочих днів у місяці
    public static int getWorkingDays(int totalDays) {
        int weekends = 8; // 2 вихідні дні в кінці тижня
        return totalDays - weekends;
    }
}

