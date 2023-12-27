package oop.interface_morningQuiz2.refactor;

import oop.interface_morningQuiz2.Duty;

public interface BankMessage {
    default String messageSend (String bankName, Duty duty) {
        return String.format("%s는 %s를 합니다.", bankName, duty.description());
    }
}
