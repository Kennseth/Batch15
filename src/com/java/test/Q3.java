package com.java.test;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number of array size to create : ");
        int arraySize=scanner.nextInt();

        int[] num=new int[arraySize];
        System.out.println("Enter numbers : ");

        for (int i = 0; i < num.length; i++) {
            num[i]=scanner.nextInt();
        }
        int maxValue=0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]>maxValue){
                maxValue=num[i];
            }
        }
        System.out.println("The largest value is : " +maxValue);
    }
}
