package Homework8;

public class Ostrich implements Bird {
    private String name;

    public Ostrich(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes booming sound");
    }

    @Override
    public void fly() {
        System.out.println(name + " cannot fly");
    }
}
