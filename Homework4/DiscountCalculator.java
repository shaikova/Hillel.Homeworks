package Homework4;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerUnit = Double.parseDouble(args[0]);

        System.out.print("Введіть кількість товару, яку ви хочете придбати: ");
        int quantity = scanner.nextInt();

        double totalCost = pricePerUnit * quantity;

        if (quantity > 10 && quantity <= 20) {
            totalCost = totalCost - (totalCost * 0.05);
        } else if (quantity > 20 && quantity <= 30) {
            totalCost = totalCost - (totalCost * 0.1);
        } else if (quantity > 30 && quantity <= 80) {
            totalCost = totalCost - (totalCost * 0.12) - (totalCost * 0.004 * (quantity - 30) / 10);
        } else if (quantity > 80) {
            totalCost = totalCost - (totalCost * 0.13);
        }

        System.out.println("Загальна вартість товару: " + totalCost);
    }
}
