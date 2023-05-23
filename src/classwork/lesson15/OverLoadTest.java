package classwork.lesson15;

public class OverLoadTest {
    void test() {
        System.out.println("Im test");
    }

    void test(int a) {
        System.out.println("Im test" + a);
    }

    void test(String a) {
        System.out.println("Im test" + a);
    }
}
