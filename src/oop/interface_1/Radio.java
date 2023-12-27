package oop.interface_1;

public class Radio implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Radio Power On.");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio Power Off.");
    }

    @Override
    public void setVolume(int volume) {
        // 인터페이스 상수 MAX_VOLUME 과 LOW_VOLUME 사용하여
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME - 15;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 볼륨 : " + this.volume);
    }
}
