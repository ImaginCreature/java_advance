package oop.advanced.model.starbucks;

public class YourLaptop {
    private Wifi internet;

    public YourLaptop(Wifi wifi) {
        this.internet = wifi;
    }

    void openKakaoTalk() {
        //this.internet 인터넷을 이용하여 카카오톡을 동작시킨다.
        this.internet.connectionInternet();
    }


}
