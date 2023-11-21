package Homework8;

public class Carp extends Fish {
    public Carp(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes grunting sound");
    }
}
