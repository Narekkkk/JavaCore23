package homework.lesson3.arrayutil;

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

    public static void printPlus(int[] array) {
        int plus = 0;
        for (int i = 0; i < array.length; i++) {
            plus += array[i];
        }
        System.out.println(plus);
    }

    public static void Sovpadenie(int[] array) {
        int i, j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                if (j == i) continue;
                boolean k = array[i] == array[j];
                if (j == i) {
                }
                System.out.println(k);
            }
        }
    }

    public static void nmanak(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int i2 = 0; i2 < array.length; i2++) {
                if (i2 == i) continue;
                if (array[i2] == array[i]) {

                    System.out.println(array[i]);
                }
            }
        }
    }

    public static void zuyger(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
    public static void kenter(int[]array){
        int x;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
            }
        }
    }
