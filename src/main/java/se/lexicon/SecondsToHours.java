package se.lexicon;

import java.util.Scanner;

public class SecondsToHours { public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    System.out.println("Write your amount of seconds below");
    System.out.print("Here: ");
    int seconds = sc.nextInt();
    int S = seconds % 60;
    int H = seconds / 60;
    int M = H % 60;
    H = H / 60;
    System.out.print( H + ":" + M + ":" + S);
    System.out.print("\n");



}
}
