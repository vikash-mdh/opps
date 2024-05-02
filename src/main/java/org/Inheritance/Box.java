package org.Inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // cube
    Box (double side){
        this.l = l;
        this.w = w;
        this.h = h;

    }

     Box(double l, double w, double h) {
         System.out.println("Box class constructor");
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box(Box old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }
    public void informatio(){
        System.out.println("running the box");
    }
}
