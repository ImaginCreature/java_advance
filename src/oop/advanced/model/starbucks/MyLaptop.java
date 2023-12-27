package oop.advanced.model.starbucks;

public class MyLaptop {
    private Wifi internet;

    public MyLaptop() {
//        this.internet = wifi;
        this.internet = new Wifi(); // 부품을 고정시킨다. MyLaptop 객체에서만 한정시킨다.
    }

    void openBrowser() {
        //this.internet 인터넷을 이용하여 브라우저를 동작한다.
        this.internet.connectionInternet();
    }
}
