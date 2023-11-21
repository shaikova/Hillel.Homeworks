package Homework8;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks");
    }
}
