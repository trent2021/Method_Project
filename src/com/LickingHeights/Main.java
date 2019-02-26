package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        helloWorld();

        hello();

        multiply();
        
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
        return;
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
}
