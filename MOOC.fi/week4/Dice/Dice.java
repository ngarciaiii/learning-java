/*
* Another file Main.java used to support Dice.java looks like this:
*

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dice dice = new Dice(6);

        int i = 0;
        while (i < 10) {
            System.out.println(dice.roll());
            i++;
        }
    }
}
*
*
*/


import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll() {
        // create here a random number belongig to range 1-numberOfSided
        return random.nextInt(numberOfSides) + 1;
    }
}
