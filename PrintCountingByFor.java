package Gouravyadav;

import java.util.Scanner;

public class PrintCountingByFor {
    public static void main(String[] args) {
        System.out.println("Till where do you want to print the numbers?");
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        for ( int b=1; b<=num; b++){
            System.out.println(b + "");
        }
    }
}