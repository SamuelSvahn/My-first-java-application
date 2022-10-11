package se.lexicon;

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
        } else if (testAge < 18 && testAge >= 15) {
            System.out.println("You can drive a bike but stay away from sugar");
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

        String firstName = "Samuel";
        String lastName = "Svahn";
        int Age = 29;
        String hobby = "Gaming";
        String sentence = firstName + lastName + " is " + Age + " old and likes " + hobby;
        System.out.println(sentence);


        //Exercise 1 week 41 name

        // number 1
        System.out.println("Hello");
        System.out.println("Samuel!");

        //number 2 week 41 Leap year

        int year = 2020;
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;

        } else leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");


        //exercise 3 week 41 Calculate





    }
}






