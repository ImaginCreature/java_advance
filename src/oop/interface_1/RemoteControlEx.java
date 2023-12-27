package oop.interface_1;

/**
 * RemoteControl 인터페이스를 기준으로 해당 TV 클래스를 구현하세요.
 */
public class RemoteControlEx {

    public static void main(String[] args) {
        // 1. 상수는 구현 객체와 상관 없는 인터페이스 멤버이므로 바로 접근해서 상수 값을 읽을 수 있다.
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);
        System.out.println(Math.PI);

        /** SAMSUNG TV 객체를 생성하여 다음과 같은 동작을 차례로 수행시키세요.
         * 1. 전원을 킨다.
         * 2. 해당 TV의 기본 MAX, MIN 볼륨 값을 확인한다.
         * 3. TV의 볼륨을 20으로 세팅하고 값을 확인한다.
         * 4. 전원을 끈다.
         * */

        RemoteControl remoteControl;
        //remoteControl SamsungTV = new TV();
        remoteControl = new TV();   // 객체를 생성하여 인터페이스타입 변수에 주입했다.

        RemoteControl SAMSUNGTV = new TV();
        SAMSUNGTV.turnOn();
        System.out.println(SAMSUNGTV.MAX_VOLUME + SAMSUNGTV.MIN_VOLUME);
        SAMSUNGTV.setVolume(20);
        SAMSUNGTV.turnOff();

        RemoteControl radio = new Radio();
        radio.turnOn();
        System.out.println(radio.MAX_VOLUME + radio.MIN_VOLUME);
        radio.setVolume(20);
        radio.turnOff();
        radio.setMute(true);    // default method 를 사용
        radio.setMute(false);
        RemoteControl.changeBattery();
    }
}
