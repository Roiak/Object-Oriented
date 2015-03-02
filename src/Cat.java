import java.util.Random;

/**
 * Created by rkarlinsky on 3/1/15.
 */


/**
 * Hw assignment 1 problem 2
 * Creating a Cat class, fed through Main class
 * Make it declare age, encounter dogs
 * and be snooty the way cats be
 */

public class Cat {

    /** generating a random number between 1 and 20, i.e. cat ages
     *  props to stack overflow for showing me how to get it in a range
     */
    public static int randInt(int min, int max) {

        Random rand = new Random();

        int randomNum = rand.nextInt((max-min)+1)+1;

        return randomNum;
    }

    // making an Age method, cat declares its age
    public static int Age(){

        int randcatNum = randInt(1, 20);

        System.out.println(randcatNum);
        return randcatNum;
    }

    public static void Hello(){
        System.out.println("I'm a cat, I'm this old: " + Age());
    }

    /**
     * making an encounterYoungDog method,
     * if the cat is older the dog is scared
     *
     */
    public static void encounterYoungDog() {
        System.out.println("Cat says: 'You're beneath my dignity you filthy animal'");
    }

    //if the cat is younger the dog chases it
    public static void encounterOldDog(){
            System.out.println("Cat says: 'It's a huge fucking dog get away!'");
    }

}

