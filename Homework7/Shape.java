package Homework7;

// Базовий клас фігури
public abstract class Shape {
    // Метод для обчислення площі фігури
    public abstract double calculateArea();
}

// Похідний клас - Коло
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Похідний клас - Трикутник
class Triangle extends Shape {
    // Метод для обчислення площі трикутника
    @Override
    public double calculateArea() {
        return 0.0;
    }
}

// Похідні класи трикутника
class RightTriangle extends Triangle {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class IsoscelesTriangle extends Triangle {
    private double base;
    private double side;

    public IsoscelesTriangle(double base, double side) {
        this.base = base;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        // Формула Герона для обчислення площі
        double semiPerimeter = (base + 2 * side) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - base) * (semiPerimeter - side) * (semiPerimeter - side));
    }
}

class EquilateralTriangle extends Triangle {
    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        // Формула для обчислення площі рівностороннього трикутника
        return (Math.sqrt(3) / 4) * side * side;
    }
}

// Похідний клас - Чотирикутник
class Quadrilateral extends Shape {
    // Метод для обчислення площі чотирикутника
    @Override
    public double calculateArea() {
        return 0.0;
    }
}

// Похідні класи чотирикутника
class Square extends Quadrilateral {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

class Rectangle extends Quadrilateral {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Parallelogram extends Quadrilateral {
    private double base;
    private double height;

    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }
}

class Trapezoid extends Quadrilateral {
    private double base1;
    private double base2;
    private double height;

    public Trapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (base1 + base2) * height;
    }
}

class Rhombus extends Quadrilateral {
    private double diagonal1;
    private double diagonal2;

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calculateArea() {
        return 0.5 * diagonal1 * diagonal2;
    }
}


