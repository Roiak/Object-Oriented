/**
 * Created by rkarlinsky on 3/3/15.
 */


//: operators/PassObject.java
// Passing objects to methods may not be
// what you’re used to.
class Letter2 {
    char c;
}
    public class PassObject1 {
        static void f(Letter2 y) {
            y.c = 'z';
        }
        public static void main(String[] args) {
            Letter2 x = new Letter2();
            x.c = 'a';
            System.out.println("1: x.c: " + x.c);
            f(x);
            System.out.println("2: x.c: " + x.c);
        }
    } /* Output:
1: x.c: a
2: x.c: z
*/

