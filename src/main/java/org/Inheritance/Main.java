package org.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(4.6,7.9,9.9);
//        Box box2 = new Box(box1);
//        System.out.println(box1.l +" "+ box1.h+" "+ box1.w);
////
//        Boxweight box3 = new Boxweight();
//        Boxweight box4 =  new Boxweight(2, 4, 8,4);
//        System.out.println(box3.h+ " "+box3.weight);
        Box box5 = new Boxweight(2, 4, 3, 8);
        System.out.println(box5.w);

        //  there are many variables in both parent and child classes
        // you are given access to variable that are in the ref type i.e BoxWeight
        // hence, you shoud have accesss to weight variable
        // this also means, that the once you are triying to acces should be initilised
        // but there, when the obj itself is of type parent class, how will you call constructor the child class
        //Boxweight box6 = new Box(2, 4, 6);
        //System.out.println(box6);

        Boxprice box = new Boxprice(5, 8, 200);



    }
}
