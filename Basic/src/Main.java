import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(4);

        clock();

    }

    // pluralize
    public static String pluralize(String animalName, int animalNum) {
        if (animalNum > 1 || animalNum == 0) {
            return animalName + "s";
        } else {
            return animalName;
        }
    }

    //int flipNum
    public static void flipNHeads(int flipNum) {
        Random rand = new Random();
        float headTail;
        int headNumber = 0;
        int trailNumber = 0;
        while (headNumber != flipNum) {
            headTail = rand.nextFloat(); //

            if (headTail >= 0.5) {
                System.out.println("heads");
                headNumber = headNumber + 1;
                trailNumber = trailNumber + 1;
            } else {
                System.out.println("tails");
                headNumber = 0;
                trailNumber = trailNumber + 1;
            }
        }
        System.out.println("It took " + trailNumber + " " + pluralize("flip", trailNumber) + " to flip " + headNumber + " head in a row.");
    }

    //clock
//    public static void clock(){
//
//        while (true){
//            float speed=0f;
//            LocalDateTime now = LocalDateTime.now();
//            int hour = now.getHour();
//            int minute = now.getMinute();
//            int second = now.getSecond();
//            // or, if you're feeling fancy
//            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
//
//                    while(second == now.getSecond()){
//                        speed= speed+1;
//                    }
//
//            System.out.println(time + " " + speed / 1000000 + " MHz");
//
//        }
//
//    }

    public static void clock() {
        while (true) {
            float speed = 0f;
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            while (second == LocalDateTime.now().getSecond()) {
                speed = speed + 1;
            }

            System.out.println(time + " " + speed / 1000000 + " MHz");

        }

    }
}

