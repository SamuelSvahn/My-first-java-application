package se.lexicon;

import java.util.Scanner;

public class TheAverageNumber { public static void main(String[] args) {
    System.out.println("Add three numbers to get the average number.");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    double num1 = sc.nextDouble();
    System.out.print("Enter the second number: ");
    double num2 = sc.nextDouble();
    System.out.print("Enter the third number: ");
    double num3 = sc.nextDouble();
    sc.close();
    System.out.print("The average of entered numbers is:" + avr(num1, num2, num3) );
}

    public static double avr(double a, double b, double c)
    {
        return (a + b + c) / 3;

}
}
