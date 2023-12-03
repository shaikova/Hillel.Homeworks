package Homework9;

public class EnumExample {
    public static void main(String[] args) {
        // Виведення інформації про кожен елемент enum
        for (Size size : Size.values()) {
            System.out.println(size);
        }
    }
}
