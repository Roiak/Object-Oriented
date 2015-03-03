/**
 * Created by rkarlinsky on 3/2/15.
 */
public class Main {
    public static void main(String[] args) {
        // first instances called are for the initializing shiz:

        Initializing1.integer(); Initializing1.character();

        // this is for the storage bit, which I think just returns
        // an integer but I can't get output:

        Exercise6.storage("Dude I like it");

        // this is for exercise 8, demonstrating only one instance of a static field

        Exercise8.field1(); Exercise8.field2(); Exercise8.field3();
        Exercise8.field4(); Exercise8.field5(); Exercise8.field1(); Exercise8.field1();
        }
}