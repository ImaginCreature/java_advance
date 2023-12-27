package oop.interface_1;

public class SmartTV implements RemoteControl, Searchable {
    private int volume;
    private int channel;
    @Override
    public void turnOn() {
        System.out.println("Smart TV Power on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV Power off");
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

    @Override
    public void setMute(boolean mute){
        RemoteControl.super.setMute(mute);
    }
    @Override
    public void search(String url) {
        System.out.println(url + "검색 시작");
    }

    @Override
    public void channelUp(int channel) {
        this.channel++;
    }

    @Override
    public void channelDown(int channel) {
        this.channel--;
    }
}
