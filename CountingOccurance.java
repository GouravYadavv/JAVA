package Gouravyadav;

import java.math.BigInteger;

public class CountingOccurance {
    public static void main(String[] args) {
        int n=575855;
        int count=0;
        while (n>0){
            int rem=n%10;
            if (rem==5){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}