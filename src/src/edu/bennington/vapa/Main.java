package edu.bennington.vapa;

import edu.bennington.cs.Cat;

/**
 * Created by rkarlinsky on 3/3/15.
 * class that responds to cat in other package
 */

public class Main {

    public static void main(String[] args){
        Cat cat = new Cat("my name is awesome");

        cat.meow();

        cat.printName();
    }




}
