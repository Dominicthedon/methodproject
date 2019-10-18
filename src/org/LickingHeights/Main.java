package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
  printGreetings();
int a,b;
a=15;
b=10;
int answer= multiplication(a,b);
System.out.print(answer);
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
    public static int multiplication(int a, int b){
        return a*b ;
    }

}
