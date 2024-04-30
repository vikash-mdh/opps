package org.singletone;
//Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it".
//In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.
public class singletone {
     private singletone(){

    }
    private static singletone instance;

    public static singletone getInstance(){
        // check whether 1 obj only is created or not

        if(instance == null){
            instance  = new singletone();
        }
        return instance;

    }

}
