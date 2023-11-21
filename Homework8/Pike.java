package Homework8;

public class Pike extends Fish {
    public Pike(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes bubbling sound");
    }
}

