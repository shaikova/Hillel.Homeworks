package Homework6;

public class Triangle {
    // Поля класу
    private double sideA;
    private double sideB;
    private double sideC;

    // Конструктор класу
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Геттери
    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    // Метод для підрахунку периметру трикутника
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    // Метод для підрахунку площі трикутника за формулою Герона
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

}
