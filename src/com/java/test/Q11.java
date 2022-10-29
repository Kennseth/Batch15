package com.java.test;

import java.util.Arrays;
import java.util.Scanner;

public class Q11 {
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
        int[] arr=new int[arraySize-1];
        for (int i = 0; i < numbers.length; i++) {
            for (int i1 = 0; i1 < arr.length; i1++) {
                if(value!=numbers[i]){
                    arr[i1]=numbers[i];
            }

           }
        }
        System.out.println(Arrays.toString(arr));


    }
}
