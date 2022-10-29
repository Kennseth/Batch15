package com.java.test;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number of array size to create : ");
        int arraySize=scanner.nextInt();

        int[] numbers=new int[arraySize];
        System.out.println("Enter numbers : ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
        }
        int value=0;
        for (int i = 0; i < numbers.length; i++) {
            for(int k=i+1;k<numbers.length;k++){
                if(numbers[i]<numbers[k]) {
                    value = numbers[i];
                    numbers[i] = numbers[k];
                    numbers[k] = value;
                }
            }

        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]+"\t");
        }
    }
}
