package Homework8;

public class Hamster extends Mammal {
    public Hamster(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " squeaks");
    }
}

