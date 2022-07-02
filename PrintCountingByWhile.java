package Gouravyadav;

import java.util.Scanner;

public class PrintCountingByWhile {
    public static void main(String[] args) {
        System.out.println("Till where do you want to print the numbers?");
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int num = 1;
        while (num<=a){
            System.out.println(num);
            num+=1;
        }
    }
}