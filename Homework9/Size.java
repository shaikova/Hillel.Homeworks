package Homework9;

public enum Size {
    S("S", 20, 30),
    M("M", 30, 40),
    XL("XL", 40, 50);

    // Поля enum
    private final String abbreviation;
    private final int width;
    private final int length;

    // Конструктор enum
    Size(String abbreviation, int width, int length) {
        this.abbreviation = abbreviation;
        this.width = width;
        this.length = length;
    }

    // Геттери для полів enum
    public String getAbbreviation() {
        return abbreviation;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    // Перевизначений метод toString
    @Override
    public String toString() {
        return "Size{" +
                "abbreviation='" + abbreviation + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
