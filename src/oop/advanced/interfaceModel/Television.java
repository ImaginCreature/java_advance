package oop.advanced.interfaceModel;

public class Television implements RemoteControl{


    @Override
    public void turnOn() {
        System.out.println("TV전원 On");
    }

    @Override
    public void turnOff() {
        System.out.println("TV전원 Off");
    }
}
