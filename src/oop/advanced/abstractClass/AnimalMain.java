package oop.advanced.abstractClass;

public class AnimalMain {
    public static void main(String[] args) {
/*        Animal animal = new Animal() {
            @Override
            public void printSound() {
                System.out.println("Bow Wow");
            }
        };*/
    Dog dog = new Dog();
    dog.printSound();
    Cat cat = new Cat();
    cat.printSound();
    Animal d = new Dog();
    Animal c = new Cat();


    }
}
