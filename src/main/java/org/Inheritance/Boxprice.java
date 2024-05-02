package org.Inheritance;

public class Boxprice extends Boxweight {
  double cost;

  Boxprice (){
      super();
      this.cost = -1;
  }

    public Boxprice(double cost) {
        this.cost = cost;
    }

    public Boxprice(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }
    public Boxprice(double side,double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}
