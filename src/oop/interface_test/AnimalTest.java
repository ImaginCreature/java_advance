package oop.interface_test;

public class AnimalTest {
    public static void main(String[] args) {
        // A.
        Dog dog = new Dog(8);
        // B.
        Chicken chicken = new Chicken(3);
        // C.
        Chicken cheatableChicken = new Chicken(5);
        // D.
        if (cheatableChicken instanceof Cheatable) {
            cheatableChicken.fly();
        }
        // E.
        for (int i = 1; i <=3; i++) {
            dog.run(i);
            chicken.run(i);
            cheatableChicken.run(i);
            System.out.printf("%d시간 후\n", i);
            System.out.printf("개의 이동거리=%s\n", dog.getDistance());
            System.out.printf("닭의 이동거리=%s\n", chicken.getDistance());
            System.out.printf("날으는 닭의 이동거리=%s\n", cheatableChicken.getDistance());
        }

    }
}
