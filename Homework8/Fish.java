package Homework8;

// Абстрактний клас для риб
public abstract class Fish implements Animal {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
