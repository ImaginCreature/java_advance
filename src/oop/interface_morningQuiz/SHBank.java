package oop.interface_morningQuiz;

public class SHBank implements Bank {
    @Override
    public void withDraw(int price) {
        System.out.print("SH은행만의 인출 로직...");
        System.out.printf("%d 원을 인출한다.\n", price);
    }

    @Override
    public void deposit(int price) {
        System.out.print("SH은행만의 입금 로직...");
        System.out.printf("%d 원을 입금한다.\n", price);
    }

    @Override
    public String findDormancyAccount(String custId) {
        return Bank.super.findDormancyAccount(custId);
    }
}
