package oop.interface_morningQuiz2.refactor;

public enum Duty {
    PERSONAL_FINANCE("개인 금융 업무"),
    ENTERPRISE_FINANCE("기업 금융 업무"),
    PB("Private Banking 업무");

    private final String desc;

    Duty(String desc) {
        this.desc = desc;
    }

    public String description() {
        return this.desc;
    }
}

