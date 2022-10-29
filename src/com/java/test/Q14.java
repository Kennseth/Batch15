package com.java.test;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number of array size to create : ");
        int arraySize=scanner.nextInt();

        int[] numbers=new int[arraySize];
        int value=0;
        System.out.println("Enter numbers : ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
            value+=numbers[i];
        }



        System.out.println(value);
    }
}
