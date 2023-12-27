package oop.interface_morningQuiz2.refactor;

import oop.interface_morningQuiz2.Duty;
import oop.interface_morningQuiz2.Finance;

/**
 * packageName : isp.domain
 * fileName : ABank
 * author :
 * date : 2023-12-27
 * description : 객체지향 원칙 인터페이스 분리 원칙(Interface Segregation Principle)
 */
public class HappyBank implements EnterpriseFinance, PersonalFinance {
    @Override
    public void doPersonalFinance() {
        System.out.println(this.messageSend(this.getClass().getSimpleName(), Duty.PERSONAL_FINANCE));
    }

    @Override
    public void doEnterpriseFinance() {
        System.out.println(this.messageSend(this.getClass().getSimpleName(), Duty.ENTERPRISE_FINANCE));
    }
}
