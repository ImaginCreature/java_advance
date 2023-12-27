package oop.interface_test;

public class Dog extends Animal{
    Dog(int speed) { super(speed); }

    @Override
    void run(int hours) {
        this.distance = 0;
        this.distance += speed * hours * 0.5;
    }
}
