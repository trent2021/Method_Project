package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        helloWorld();

        hello();

        multiply();

        divide();

        max();

    }

    public static void helloWorld() {
        System.out.println("Hello World");
    }


    public static void hello(){
        String name;
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("Enter your name");
        name = keyboard.nextLine();
        System.out.println("Hello " + name);
    }
    public static void multiply(){
        Scanner keyboard;
        int firstNumber;
        int secondNumber;
        int multiplied;
        keyboard = new Scanner(System.in);

        System.out.println("Enter a number");
        firstNumber = keyboard.nextInt();
        System.out.println("Enter another number");
        secondNumber = keyboard.nextInt();

        multiplied = (firstNumber*secondNumber);
        System.out.println("Your numbers multipled equal " + multiplied);
    }
    public static void divide(){
        Scanner keyboard;
        double firstNumber;
        double secondNumber;
        double divided;
        keyboard = new Scanner (System.in);


        System.out.println("Enter a number");
        firstNumber = keyboard.nextDouble();
        System.out.println("Enter another number");
        secondNumber = keyboard.nextDouble();

        divided = (firstNumber/secondNumber);
        System.out.println("Your numbers divided equal " + divided);
    }
    public static void max(){
        Scanner keyboard;
        double firstNumber;
        double secondNumber;

        keyboard = new Scanner (System.in);

        System.out.println("Enter a number");
        firstNumber = keyboard.nextDouble();
        System.out.println("Enter another number");
        secondNumber = keyboard.nextDouble();

        if (firstNumber>secondNumber) {
            System.out.println(firstNumber);
        }
        else {
        }
        if(secondNumber>firstNumber) {
            System.out.println(secondNumber);
        }
    }

}
