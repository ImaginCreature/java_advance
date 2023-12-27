package oop.interface_morningQuiz2;

public interface Finance {
    void doPersonalFinance();
    void doEnterpriseFinance();
    default String msg(String bankName, Duty duty) {
        return String.format("%s는 %s를 합니다.", bankName, duty.description());
    }
}

