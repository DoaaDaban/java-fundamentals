import java.util.Random;


public class Main {

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    }

    public static String pluralize(String animalName, int animalNum) {
        if (animalNum > 1 || animalNum == 0) {
            return animalName + "s";
        } else {
            return animalName;
        }
    }
}
