package oop.interface_test;

public class Chicken extends Animal implements Cheatable {
    Chicken(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        this.distance = 0;
        this.distance += speed * hours;
    }

    @Override
    public void fly() {
        this.speed *= 2;
    }
}
