package Homework6;

public class Employee {
    // Поля класу
    private String lastName;
    private String firstName;
    private String position;
    private double hourlySalary;

    // Конструктор класу
    public Employee(String lastName, String firstName, String position, double hourlySalary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.hourlySalary = hourlySalary;
    }

    // Геттери
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPosition() {
        return position;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    // Сеттери
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    // Метод для розрахунку заробітної платні за певну кількість годин
    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlySalary;
    }
}
