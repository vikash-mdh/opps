package org.OPPS;
import java.util.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       // Store 5 roll no
        //int [] num = new int[5];

        // store 5 names
       // String []name = new String[6];

        // data of five student :{roll no, name, marks};

//        int rno[] = new int[5];
//        String [] naam = new String[5];
//        float marks[] = new float[5];

        Student[] student = new Student[5];

        // just declearing value
        Student vikash = new Student();
        System.out.println(vikash.rno);
        System.out.println(vikash.name);
        System.out.println(vikash.marks);

    }
}
// create a class
// for every student singlt student

class Student{
    int rno;
    String name;
    float marks;
}