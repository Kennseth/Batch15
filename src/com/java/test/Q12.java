package com.java.test;

import com.sun.source.doctree.EndElementTree;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number of array size to create : ");
        int arraySize=scanner.nextInt();

        int[] numbers=new int[arraySize];
        System.out.println("Enter numbers : ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
        }
       int[] arr=new int[arraySize-1];
        for (int i = 0; i < numbers.length; i++) {
            for (int i1 = 0; i1 < arr.length; i1++) {


                if (arr[i1] == numbers[i]) {
                    continue;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
