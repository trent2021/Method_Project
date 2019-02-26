package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        helloWorld();

        hello();










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
}
