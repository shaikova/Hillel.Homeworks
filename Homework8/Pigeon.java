package Homework8;

public class Pigeon implements BirdOfPrey {
    private String name;

    public Pigeon(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes cooing sound");
    }

    @Override
    public void fly() {
        System.out.println(name + " flaps its wings");
    }

    @Override
    public void hunt() {
        System.out.println(name + " is hunting");
    }
}
