package edu.bennington.cs;

/**
 * Created by rkarlinsky on 3/3/15.
 * Week 2 lab stuff
 * A class that has some shit on cats
 */
public class Cat {

    private String catName;

    public Cat(String catName){
        this.catName = catName;
    }

    public String getName(){
        System.out.println("I'm a cat, my name is:");
        return this.catName;
    }

    public void printName(){
        System.out.println(getName());
    }
    public static void meow(){
        System.out.println("meow");
    }

}