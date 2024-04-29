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
        // this is the class
        Student vikash = new Student(13, "vikash kumar", 84.5f);
//        vikash.rno = 12;
//        vikash.marks = 88.5f;
//        vikash.name = "deepak dildar";


        System.out.println(vikash.rno);
        System.out.println(vikash.name);
        System.out.println(vikash.marks);


        Student random = new Student(vikash);
        System.out.println(vikash.name);


    }
}
// create a class
// for every student singlt student

// this is the studetnt class
class Student{
    int rno;
    String name;
    float marks;

    // we need a way to add the values the above properties object by object

    // we need one word to access every object

    void greeting(){
        System.out.println("hello my name is " + this.name);
    }
    void  changeNmae(String newName){
        this.name = newName;
    }
    Student (Student other){
        this.name = other.name;
        this.marks = other.marks;
        this.rno = other.rno;
    }

    Student(){
      // this is how you  call a constructor from anoter conastucto
    }

    // Student kajal = new Student(17, "Arpit". 89.9f);
    // here, this will be replacce with arpit
    Student(int rno, String name, float marks){
        this.rno = 12;
        this.marks = 88.5f;
        this.name = "deepak dildar";

    }
}