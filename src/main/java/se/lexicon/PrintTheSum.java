package se.lexicon;

import java.util.Scanner;

public class PrintTheSum { public static void main(String[] args) {

    int number1, number2, sum;

    Scanner sc = new Scanner(System.in);

    System.out.print("Input first number: ");
    int num1 = sc.nextInt();

    System.out.print("Input second number: ");
    int num2 = sc.nextInt();


    System.out.println(num1 + " + " + num2 + " = " +
            (num1 + num2));

    System.out.println(num1 + " - " + num2 + " = " +
            (num1 - num2));

    System.out.println(num1 + " x " + num2 + " = " +
            (num1 * num2));

    System.out.println(num1 + " / " + num2 + " = " +
            (num1 / num2));


}
}
