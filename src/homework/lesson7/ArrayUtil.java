package homework.lesson7;

public class ArrayUtil {



    public static void printMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public static void printMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);

    }

    public static void homeWorkTest(int[] array) {
        double x = 0;
        for (int i = 0; i < array.length; i++) {
            x += array[i];
        }
        System.out.println(x);
        System.out.println(x/ array.length);
    }
}



