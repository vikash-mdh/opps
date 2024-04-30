package org.singletone;

public class main {
    public static void main(String[] args) {
        singletone obj = singletone.getInstance();

        singletone obj1 = singletone.getInstance();

        singletone obj2 = singletone.getInstance();

        // all three variable are pointing to just one on objects
    }
}
