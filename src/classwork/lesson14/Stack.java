package classwork.lesson14;

public class Stack {
 int[] name = new int[10];
 int index;
 Stack (){
     index = -1;

 }
 void push(int value) {
     if (index == 9){
         System.out.println("Stack is full");
     }else name [++index] = value;
 }
  int pop(){
     if (index< 0){
         System.out.println("Stack is empty");
         return 0;
     }else return name[index--];
  }
    }

