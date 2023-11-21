package Homework8;

// Абстрактний клас для ссавців
public abstract class Mammal implements Animal {
    private String name;

    public Mammal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
