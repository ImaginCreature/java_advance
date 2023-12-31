package oop.interface_test;

abstract class Animal {
    int speed;
    double distance;

    Animal(int speed) {this.speed = speed;}
    abstract void run(int hours);
    double getDistance(){
        return this.distance;
    }
}
