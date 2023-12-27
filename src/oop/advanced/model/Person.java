package oop.advanced.model;

public class Person {
    /*private Phone phone;

    Person(Phone phone) {
        this.phone = phone;
    }

    public void createMessage() {
        String message = "안녕 반가워. 오늘 몇 시에 만날까?";
        String to = "내친구";
        // 폰의 문자 전송 기능 호출 this.phone.
        this.phone.sendMessage(to, message);
    }*/
    public void sendMessage(Phone phone) {
        String to = "나의 벗";
        String message = "보고싶다.";
        phone.sendMessage(to, message);
    }

}
