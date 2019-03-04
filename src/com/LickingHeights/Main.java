package com.LickingHeights;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;
        String name;
        int multiplyFirstNumber;
        int multiplySecondNumber;
        double divideFirstNumber;
        double divideSecondNumber;
        keyboard = new Scanner(System.in);


        helloWorld();

        System.out.println("Enter your name");
        name = keyboard.nextLine();
        System.out.println(hello(name));


        System.out.println("Enter a number");
        multiplyFirstNumber = keyboard.nextInt();
        System.out.println("Enter another number");
        multiplySecondNumber = keyboard.nextInt();
        System.out.println(multiply(multiplyFirstNumber,multiplySecondNumber));
        System.out.print(("Your numbers multiplied equal ") + multiply(multiplyFirstNumber,multiplySecondNumber));

        System.out.println(" ");
        System.out.println("Enter a number");
        divideFirstNumber = keyboard.nextDouble();
        System.out.println("Enter another number");
        divideSecondNumber = keyboard.nextDouble();
        System.out.println(divide(divideFirstNumber,divideSecondNumber));
        System.out.println(("Your numbers divided equal ") + divide(divideFirstNumber,divideSecondNumber));


        System.out.println(max(0));

        System.out.println(switchWords(""));






    }
    public static void helloWorld(){
    System.out.println("Hello World");

    }
    public static String hello(String name){

        return "Hello " + name;
    }
    public static int multiply(int firstNumber, int secondNumber){

        return firstNumber * secondNumber;

    }
    public static double divide(double firstNumber, double secondNumber){

       return firstNumber / secondNumber;

    }

    public static double max(double number) {
        {
            double firstNumber;
            double secondNumber;
            number = 0;
            Scanner keyboard;
            keyboard = new Scanner(System.in);

            System.out.println(" ");
            System.out.println("Enter a number");
            firstNumber = keyboard.nextDouble();
            System.out.println("Enter another number");
            secondNumber = keyboard.nextDouble();
            System.out.print("The higher number is ");


            if (firstNumber > secondNumber) {
                number = firstNumber;
            } else {
                number = secondNumber;
            }

            return number;

        }
    }
    public static String switchWords(String combinedWords){
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String firstWord;
        String secondWord;

        System.out.println("Enter a word");
        firstWord=keyboard.nextLine();
        System.out.println("Enter another word");
        secondWord=keyboard.nextLine();
        combinedWords = secondWord + " " + firstWord;

        return combinedWords;


    }
}
