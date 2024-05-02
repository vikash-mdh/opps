package org.Inheritance;

public class Boxweight extends Box {
    double weight;
    public Boxweight(){
        this.weight = -1;
    }
    Boxweight(Boxweight other){
        super(other);
        weight = other.weight;
    }
    Boxweight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public Boxweight(double l, double w, double h, double weight) {
        super(l, w, h); // what is this? call the parent class constructor
        // used to initilised value parent class in constructor
        this.weight = weight;
    }
}
