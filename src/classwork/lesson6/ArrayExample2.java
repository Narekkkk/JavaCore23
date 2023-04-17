package classwork.lesson6;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[][] numbers =new int[4][5];
        int i,j,k = 0;
        for ( i = 0; i < 4; i++) {
            for ( j = 0; j < 5; j++) {
                numbers[i][j]=k;
                k++;

                }
            }
        for ( i = 0; i < 4; i++) {
            for ( j = 0; j <5; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
        }

        }


