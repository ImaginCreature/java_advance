package oop.interface_morningQuiz2.refactor;

import oop.interface_morningQuiz2.Duty;
import oop.interface_morningQuiz2.Finance;
import oop.interface_morningQuiz2.PB;

/**
 * packageName : oop.isp.before
 * fileName : BBAnk
 * author :
 * date : 2023-12-27
 * description : 객체지향 원칙 인터페이스 분리 원칙(Interface Segregation Principle)
 */
public class UnhappyBank implements PrivateBankingFinance {
    @Override
    public void doPrivateBanking() {
        System.out.println(this.messageSend(this.getClass().getSimpleName(), Duty.PB));
    }
}
