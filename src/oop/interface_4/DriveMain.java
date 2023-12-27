package oop.interface_4;

public class DriveMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);  // 자동 타입 변환 (promotion) --> 오버라이딩 메서드 호출 --> 다형성 구현
        driver.drive(taxi); // 자동 타입 변환 (promotion) --> 오버라이딩 메서드 호출 --> 다형성 구현
        ride(taxi);
        ride(bus);
    }

    // 인터페이스 매개 변수를 갖는 메서드
    public static void ride(Vehicle vehicle) {
        if(vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }

        if(vehicle instanceof Bus bus) bus.checkFare(); // 자바 12버전부터 가능
        vehicle.run();
    }
}
