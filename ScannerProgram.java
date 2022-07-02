package Gouravyadav;

import java.util.Scanner;

public class ScannerProgram {
    public static void main(String[] args) {
        System.out.println("What is your name ?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Your name is: " + name);
        System.out.println("ThankYou for using our program");
    }
}