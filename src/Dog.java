import java.util.Random;

/**
 * Created by rkarlinsky on 3/1/15.
 */


/**
 * First hw assignment, problem 2
 * Creating Cat and Dog classes with all sorts of instances
 * Running through the Main class!
 * @ authored by Roi
 */

// Creating a Dog class
public class Dog {

    /**
     * generating a random number between 1 and 14, i.e. dog ages
     * props to stack overflow for showing me how to get it in a range
     */
    public static int randInt(int min, int max) {

        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + 1;

        return randomNum;
    }

    // making an Age method, dog declares its age
    public static int Age() {
        int randogNum = randInt(1, 14);
        System.out.println(randogNum);

        return randogNum;
    }

    public static void Hello(){

        System.out.println("I'm a dog, I'm this old: " + Age());
    }


    /**
     * making an encounterYoungCat method,
     * if the cat is older the dog is scared
     */
    public static void encounterOldCat() {
        System.out.println("Dog says: 'Jesus... ok, fine, yes I'm leaving you bitchy cat'");

    }

    //if the cat is younger the dog chases it
    public static void encounterYoungCat(){
            System.out.println("Dog says: 'I'm gonna get you you tasty kitten'");

    }

}
