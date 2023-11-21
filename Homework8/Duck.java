package Homework8;

public class Duck implements Bird {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes quacking sound");
    }

    @Override
    public void fly() {
        System.out.println(name + " can fly");
    }
}
