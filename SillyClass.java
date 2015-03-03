package edu.bennington.cs;

import javax.print.DocFlavor;

/**
 * Created by acencini on 3/1/15.
 *
 * This class has a number of simple errors in it.  Your job
 * is to fix those errors, such that the Main class can use
 * SillyClass - in other words, fix the errors so the project
 * will compile and run without error!
 *
 * Also, add comments to each function and member to indicate
 * what each thing does.  When done, check this and Main.java
 * into your GitHub repo (you will not receive credit if this is
 * not done).
 *
 */
public class SillyClass {

    // create a private string object called secretString
    private String secretString;

    // create another string object called magicString initialized as "magic"
    public static String magicString = "magic";

    // create another string object called otherString
    public String otherString;

    // Little void method, printSomething, which takes a string object and prints it
    private void printSomething(String thingToPrint) {
        System.out.println(thingToPrint);
    }

    // a method, getSecretString, which gets the secretString object and
    // returns and prints it
   private String getSecretString() {
        System.out.println(this.secretString);
        return this.secretString;
    }

    // public method which takes the string object secretString and makes
    // the otherString object an upper case version of that
    public SillyClass(String secret) {
        this.secretString = secret;
        this.otherString = secret.toUpperCase();
    }

    // a method which calls the printSomething method
    public void callPrintSomething(String something) {
        this.printSomething(something);
    }

    // a method which runs through a loop a number of times, printing out a message
    // to indicate each count
    public void callPrintABunchOfTimes(int numTimes, String message) {
        for (int i=0; i<numTimes; i++) {
            this.printSomething(message);
        }}

    // a method which takes and returns the secretString object
    public String getAString() {
        return this.secretString;
    }

    // a method which will print out the magic string and then return the otherString object
    public String printHello() {
        System.out.println(magicString);
        return this.otherString;
    }

}
