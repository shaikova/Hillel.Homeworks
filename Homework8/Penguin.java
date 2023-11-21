package Homework8;

public class Penguin implements Bird {
    private String name;

    public Penguin(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes squawking sound");
    }

    @Override
    public void fly() {
        System.out.println(name + " cannot fly");
    }
}
