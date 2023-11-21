package Homework8;

public class Catfish extends Fish {
    public Catfish(String name) {
        super(name);
    }

    @Override
    public void makeSound() {

        System.out.println(getName() + " makes humming sound");
    }
}
