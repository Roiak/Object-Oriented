/**
 * Created by rkarlinsky on 3/1/15.
 */

/**
 * First homework assignment, problem 2
 * For some reason the Age methods in both Dog and Cat classes seem to
 * be holding more than one integer as a return value, or generating multiple ones.
 * I want it to be the same value held so that when Hello or the encounter methods are called
 * they will have the same number. Not sure exactly why this isn't happening
 */
public class Main {
    public static void main(String[] args){
        //Dog.Age(); Cat.Age();
        Dog.Hello(); Cat.Hello();
        if (Dog.Age() <= Cat.Age())
            Cat.encounterYoungDog(); Dog.encounterOldCat();
        if (Dog.Age() > Cat.Age())
            Dog.encounterYoungCat(); Cat.encounterOldDog();

    }


}
