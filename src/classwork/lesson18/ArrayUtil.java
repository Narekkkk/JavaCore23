package classwork.lesson18;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {5, 15, 24, 21, 36, 75, 15, -8, 9, 12};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max=" + max);
        System.out.println();
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }
        }
        System.out.println("Min=" + min);
        System.out.println("Print all evens");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");

            }

        }
        System.out.println();
        System.out.println("Print all odds");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Count of even: " + evenCount);
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Odd of count: "+oddCount);
        System.out.println();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        System.out.println("Sum: "+ sum);
        System.out.println("Avg: "+sum/array.length);
    }
}