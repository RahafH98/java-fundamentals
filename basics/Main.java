package basics;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // class 01

        // Pluralize //
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

       



        flipNHeads(1);
        flipNHeads(1);
        flipNHeads(2);

       



        clock();

    }

  

    public static String pluralize(String pluralizeWord, int count) {
        if (count == 1) {
            return pluralizeWord;
        } else {
            return pluralizeWord + "s";
        }
    }


   
    public static void flipNHeads(int n) {
        Random random = new Random();
        int consecutiveHeads = 0;
        int flips = 0;

        while (consecutiveHeads < n) {
            double coinFlip = random.nextDouble();
            if (coinFlip >= 0.5) {
                System.out.println("heads");
                consecutiveHeads++;
            } else {
                System.out.println("tails");
                consecutiveHeads = 0;
            }
            flips++;
        }

        System.out.println("It took " + flips + " flips to flip " + n + " head" + (n > 1 ? "s" : "") + " in a row.");
    }


    public static void clock() {
        LocalDateTime prevTime = null;

        while (true) {
            LocalDateTime now = LocalDateTime.now();
            if (prevTime == null || now.getSecond() != prevTime.getSecond()) {
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(time);
                prevTime = now;
            }
        }

    }
}