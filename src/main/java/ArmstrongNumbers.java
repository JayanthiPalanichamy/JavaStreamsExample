package main.java;

import java.util.stream.IntStream;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        IntStream.range(1,1000).filter(x->{
            int sum=0;
            int x1=x;
            while(x !=0) {
                int temp = x % 10;
                sum +=Math.pow(temp,Integer.toString(x1).length());
                x /=10;
            }
            return sum==x1;
        }).forEach(System.out::println);
    }
}
