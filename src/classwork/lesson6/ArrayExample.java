package classwork.lesson6;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {7, 12, 45, 8, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println();

        numbers[0] = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
    }
}
