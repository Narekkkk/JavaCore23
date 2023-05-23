package classwork.lesson15;

public class OverLoadTestDemo {
    public static void main(String[] args) {
        OverLoadTest overLoadTest = new OverLoadTest();
        overLoadTest.test();
        overLoadTest.test(1);
        overLoadTest.test("Hello");
    }
}
