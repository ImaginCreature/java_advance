package oop.interface_morningQuiz;

public class KakaoBank {

    void withDraw(int price) {
        System.out.print("카카오은행만의 인출 로직...");
        System.out.printf("%d 원을 인출한다.\n", price);
    }


    void deposit(int price) {
        System.out.print("카카오은행만의 입금 로직...");
        System.out.printf("%d 원을 입금한다.\n", price);
    }

    String findDormancyAccount(String custId) {
        System.out.println("**금융개정법안 00이후 고객의 휴면계좌 찾아주기 운동**");
        System.out.println("**금융결제원에서 제공하는 로직**");
        return "00은행 000-000-0000-00";
    }
}
