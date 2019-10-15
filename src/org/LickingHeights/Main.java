package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
  printGreetings();

    }
    public static void printGreetings (){
    System.out.println("Hello World");
    printname();
    }

    public static void printname (){
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String userName;
        System.out.println("What is your name");
        userName = keyboard.nextLine();
        System.out.println("Hello"+ " " + userName );
    }
}
