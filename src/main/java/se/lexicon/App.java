package se.lexicon;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Lecture one by myself

        int age = 29;
        System.out.println("Age: " + age);


        double salary = 30000.00;
        System.out.println("Salary: " + salary);


        boolean studentStatus = true;
        boolean accountstatus = false;


        double test;
        test = 12.22;


        char a = 'a';

        int number1 = 10;
        int number2 = 20;

        int result = number1 + number2;
        System.out.println("Result:" + result);

        int number = 0;
        System.out.println(++number);

        int num1 = 10;
        int num2 = 20;
        boolean isEqual = num1 != num2;

        int testAge = 20;
        if (testAge >= 18) {
            System.out.println(" You can have som Coca Cola");
        } else {
            System.out.println("Stick to water");
        }

        double n1 = 5, n2 = 7, res = 0;
        char operator = '+';
        switch (operator) {
            case '+':
                res = n1 + n2;
                break;
            case '-':
                res = n1 - n2;
                break;

            default:
                System.out.println("You stupid");
        }
        System.out.println(res);


        String name = "Samuel";
        name = name.concat(" Svahn");
        System.out.println("name = " + name);


        //Excersies week 1

        // number 1
        System.out.println("Hello");
        System.out.println("Samuel!");

        //number 2


    }
}






