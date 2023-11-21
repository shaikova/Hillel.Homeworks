package Homework8;

public class Stork implements BirdOfPrey {
    private String name;

    public Stork(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes clattering sound");
    }

    @Override
    public void fly() {
        System.out.println(name + " glides gracefully");
    }

    @Override
    public void hunt() {
        System.out.println(name + " is hunting");
    }
}

