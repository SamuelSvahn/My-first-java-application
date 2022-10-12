package se.lexicon;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean condition = true;

        while (true) {

            CalculatorMathematics.displaymenu();
            System.out.println("Enter operation type (+ , - , / , *) ");
            char operationtype = scanner.next().charAt(0);


            System.out.println("Enter your number");
            double number1 = scanner.nextInt();
            System.out.println("Enter the second number");
            double number2 = scanner.nextInt();


            double result = 0;

            switch (operationtype) {
                case '+':
                    result = CalculatorMathematics.addition(number1, number2);
                    System.out.println("The answer is " + result);
                    break;

                case '-':
                    result = CalculatorMathematics.subtraction(number1, number2);
                    System.out.println("The answer is " + result);
                    break;

                case '/':
                    result = CalculatorMathematics.division(number1, number2);
                    System.out.println("The answer is " + result);
                    break;

                case '*':
                    result = CalculatorMathematics.multiplication(number1, number2);
                    System.out.println("The answer is " + result);
                    break;

                default:
                    System.out.println("Something went wrong try again");

            }


            System.out.println("Do you want to continue? (Yes or no?");
            String continueOperation = scanner.next();
            if (continueOperation.equalsIgnoreCase("no")) {
                System.out.println("Thanks for trying the calculator");
                condition = false;
                {
                    break;
                }


            }
        }
    }
}