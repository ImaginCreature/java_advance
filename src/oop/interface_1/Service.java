package oop.interface_1;

public interface Service {
    // default 메서드
    default void defaultMethod1 () {
        System.out.println("defaultMethod1()의 종속 코드");
        defaultCommon();
    }
    default void defaultMethod2 () {
        System.out.println("defaultMethod2()의 종속 코드");
        defaultCommon();
    }

    // private 메서드
    private void defaultCommon(){
        System.out.println("defaultMethod 의 중복 코드 1");
        System.out.println("defaultMethod 의 중복 코드 2");
    }

    // 정적 메서드
    static void staticMethod1() {
        System.out.println("staticMethod1 의 종속 코드");
        staticCommon();
    }
    static void staticMethod2() {
        System.out.println("staticMethod2 의 종속 코드");
        staticCommon();
    }
    
    // private static 메서드
    private static void staticCommon() {
        System.out.println("staticMethod 중복 코드 1");
        System.out.println("staticMethod 중복 코드 2");
    }

}
