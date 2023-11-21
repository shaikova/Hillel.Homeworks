package Homework8;

public class Kiwi implements Bird {
    private String name;

    public Kiwi(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes chirping sound");
    }

    @Override
    public void fly() {
        System.out.println(name + " cannot fly");
    }
}

