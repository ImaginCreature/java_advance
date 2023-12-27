package oop.interface_1;

public class MultiInterfaceMain {
    public static void main(String[] args) {
        RemoteControl remoteControl;
        Searchable searchable;

        remoteControl = new SmartTV();
        remoteControl.turnOn();
        remoteControl.turnOff();
        remoteControl.setVolume(20);
        remoteControl.setMute(true);

        searchable = new SmartTV();
        searchable.search("https://naver.com");

    }
}
