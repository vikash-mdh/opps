package org.OPPS;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Integer num = 45;


        swap(a, b);
        System.out.println(a +" "+b);


    }
     public static void  swap(int a, int b){
        int temp = 10;
        a = b;
        b = temp;

     }
}
