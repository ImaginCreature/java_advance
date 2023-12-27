package oop.interface_3;

public class Interface3Main {
    public static void main(String[] args) {
        // 구현 객체 생성
        // 원래 예제는 부모는 B, C 자식은 D, E 였다.
        B b = new B();
        C c = new C();
        B bc = new C();
        System.out.println("=====================");

        D d = new D();
        E e = new E();
        System.out.println("=====================");

        // 인터페이스 변수 선언
        A a;
        System.out.println("=====================");

        // 변수에 구현 객체 대입
        a = b;  // A <=== B 자동 타입 변환 (promotion)
        B b1 = (B)a;    // A ===> B 캐스팅 (casting)
        a = c;  // A <=== C 자동 타입 변환
        C c1 = (C)a;
        a = d;  // A <=== D 자동 타입 변환
        D d1 = (D)a;
        a = e;  // A <=== E 자동 타입 변환
        E e1 = (E)a;
    }
}
