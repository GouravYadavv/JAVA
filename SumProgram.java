package Gouravyadav;

import java.util.Scanner;

public class SumProgram {
    public static void main(String[] args) {
        System.out.println("This program is to print the sum of two numbers");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("The sum of these two numbers is : "+ sum);
    }
}
