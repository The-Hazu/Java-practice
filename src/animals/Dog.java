package animals;

import interfaces.Playable;

public class Dog extends Animals implements Playable {
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void play() {
        System.out.println("Собака играет с хвостом");
    }
}

/*
class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}
 */