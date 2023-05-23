package classwork.lesson6;

public class ArrayExample3 {
    public static void main(String[] args) {
        String[] a = {"Hello ", "from ", "Java "};
        //tpum enq sovorakan masiv
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;
        //popoxakan vory carayum e poxanakman hamar
        String temp;
        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1]=a[i];
            a[i]=temp;
        }
        //tpum enq verjnakan popoxvac masivy
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);

        }
    }
}

