/**
 * Created by rkarlinsky on 3/3/15.
 * This is exercise 8 which attempts to demonstrate that there's
 * only one instance of a static field per class
 * I'm a little confused on this part.
 */
public class Exercise8 {

    public static void field1(){
        int d = 3;
        System.out.println(d);
    }

    public static void field2(){
        int d = 4;
        System.out.println(d);
    }

    public static void field3(){
        int d = 7;
        System.out.println(d);
    }

    public static void field4(){
        int d = 6;
        System.out.println(d);
    }

    public static void field5(){
        int d = 5;
        System.out.println(d);
    }

}
