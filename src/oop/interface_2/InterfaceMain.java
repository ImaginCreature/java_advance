package oop.interface_2;

public class InterfaceMain {
    public static void main(String[] args) {
        // Impl 이 Implement 의 약자. 실제 구현을 하는 클래스.
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA interfaceA = impl;
        InterfaceB interfaceB = impl;
        InterfaceC interfaceC = impl;

        interfaceA.methodA();
//        System.out.println(InterfaceA.toString());
        System.out.println(impl.toString());    // impl의 주소값 출력

        interfaceB.methodB();

        // interfaceC 가 A와 B를 extends 했기 때문에 세 인터페이스들에 속하는 모든 메서드를 호출 가능하다.
        interfaceC.methodC();
        interfaceC.methodA();
        interfaceC.methodB();

    }
}
