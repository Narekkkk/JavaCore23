package homework.lesson6;

public class MethodTest {
    static int x = 7, y = 5;

    static int minNumberPrint() {
        if (x > y) {
            return y;
        } else {
            return x;

        }
    }
    static boolean dividesByTwo(){
        return (x % 2==0);
    }

    public static void main(String[] args) {
        System.out.println(minNumberPrint());
        System.out.println(dividesByTwo());
    }
}