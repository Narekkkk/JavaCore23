package classwork.lesson12;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box (1,3,4);
        Box myBox2 = new Box (1,2,4);
        System.out.println(myBox.equalTo(myBox2));
    }
}
