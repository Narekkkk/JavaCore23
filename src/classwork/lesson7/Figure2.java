package classwork.lesson7;

public class Figure2 {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            for (int j = 4; j > i ; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            for (int l = i-1; l >= 1; l--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 0 ; i--) {
            for (int j = 4; j >i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");
            }
            for (int l = i- 1; l >=1 ; l--) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
