package Gouravyadav;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println("Till which number do you want to print ?");
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int a =0;
        int b=1;
        int count =2;
        while (count<=n){
            int temp = b;
            b=a+b;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}