package oop.interface_1;

/** 정적 메소드 : 구현 객체가 없어도 인터페이스만으로 호출할 수 있다. ( RemoteControl.changeBattery() ) */
public interface RemoteControl {
    // 1. 상수 필드
    int MAX_VOLUME = 30;    // 상수 : public static final 이지만 인터페이스 안에서 변수를 선언하면 컴파일과정에서 자동으로 이게 붙는다.
    public static final int MIN_VOLUME = 0; // 자동으로 붙는 걸 직접 써줬을 때

    // 2. 추상 메서드 abstract, {}바디가 없는 메서드(메서드 선언부만 작성)
    void turnOn();  // 전원 켬

    void turnOff(); // 전원 끔

    void setVolume(int volume); // 볼륨 세팅


    // 3. 디폴트 인스턴스 메서드 (default method) 완전한 실행 코드를 가진(=바디에 내용이 있는) 유일한 메서드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("Mute Processing.");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("Mute Cancel");
        }
    }

    static void changeBattery() {
        System.out.println("리모컨 건전지를 교환해야 합니다.");
    }

}

