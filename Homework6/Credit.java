package Homework6;

public class Credit {
    // Поля класу
    private String customerName;
    private double loanAmount;
    private double interestRate;
    private int loanTermInMonths;

    // Конструктор класу
    public Credit(String customerName, double loanAmount, double interestRate, int loanTermInMonths) {
        this.customerName = customerName;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTermInMonths = loanTermInMonths;
    }

    // Геттери
    public String getCustomerName() {
        return customerName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getLoanTermInMonths() {
        return loanTermInMonths;
    }

    // Метод для підрахунку суми виплати кредиту
    public double calculateTotalPayment() {
        double monthlyInterestRate = interestRate / 100 / 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -loanTermInMonths));
        return monthlyPayment * loanTermInMonths;
    }
}
