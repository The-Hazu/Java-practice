package main;

import animals.Cat;
import animals.Dog;

public class Chernovik2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик",10);
        dog.play();
        dog.eat();
        dog.makeSound();
        System.out.println(dog);
        Cat cat = new Cat("Милла",5);
        cat.eat();
        cat.makeSound();
        System.out.println(cat);
    }
}


