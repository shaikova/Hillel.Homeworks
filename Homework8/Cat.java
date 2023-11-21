package Homework8;

public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows");
    }
}
