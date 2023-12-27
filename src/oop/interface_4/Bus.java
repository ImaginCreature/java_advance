package oop.interface_4;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bus Drive");
    }
    public void checkFare(){
        System.out.println("버스 승차 요금을 확인해 주세요 !");
    }
}
