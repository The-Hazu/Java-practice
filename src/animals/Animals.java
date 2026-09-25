package animals;

public class Animals {
    String name;
    int age;
    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println(name + " кушает. ");
    }
    public void makeSound() {
        System.out.println(name + " издаёт звук. ");
    }
    @Override
    public String toString() {
        return "Animals{" + "name='" + name + "', age=" + age + "}";
    }
}
