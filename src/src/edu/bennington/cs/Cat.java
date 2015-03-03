package edu.bennington.cs;

/**
 * Created by rkarlinsky on 3/3/15.
 * Week 2 lab stuff
 * A class that has some shit on cats
 */
public class Cat {

    private String catName;

    public String name;

    public Cat(String catName){
        this.catName = catName;
        this.name = name;
    }

    public String getName(){
        System.out.println("I'm a cat, my name is" + catName);
        return this.name;
    }

    public void printName(){
        System.out.println("my cat name is" + getName());
    }
    public static void meow(){
        System.out.println("meow");
    }

}