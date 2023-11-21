package Homework8;

public class Eagle implements BirdOfPrey {
    private String name;

    public Eagle(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes screeching sound");
    }

    @Override
    public void fly() {
        System.out.println(name + " soars high");
    }

    @Override
    public void hunt() {
        System.out.println(name + " is hunting");
    }
}
