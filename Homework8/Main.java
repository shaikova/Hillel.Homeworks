package Homework8;
//
public class Main {
    public static void main(String[] args) {
        Pike pike = new Pike("Northern Pike");
        pike.makeSound();

        Dog dog = new Dog("Buddy");
        dog.makeSound();

        Penguin penguin = new Penguin("Emperor Penguin");
        penguin.makeSound();
        penguin.fly();

        Eagle eagle = new Eagle("Golden Eagle");
        eagle.makeSound();
        eagle.fly();
        eagle.hunt();

        Airplane airplane = new Airplane();
        airplane.fly();

        Car car = new Car();
        car.drive();

        Boat boat = new Boat();
        boat.sail();
    }
}
