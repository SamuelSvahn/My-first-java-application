package se.lexicon;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the guessing game!");

        Scanner sc = new Scanner(System.in);
        int k = 5;
        int i , guess;

        int number= (int) (Math.random() * 100);

        System.out.println("A number between 1-100 is chosen");

        for (i = 1; i <= k; i++) {
            System.out.println("Guess the number below");
            guess = sc.nextInt();

            if (guess == number ) {
                System.out.println("You guessed right!");
                System.out.println("You tried :" + i + " times");
                break;

            } else if (number > guess && i != k - 1) {
                System.out.println("The number is greater than " + guess + " try again.");

            } else if ( number < guess && i != k -1) {
                System.out.println("The number is lower than " + guess + " try again.");
            }
        }




    }


}

