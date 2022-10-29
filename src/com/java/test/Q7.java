package com.java.test;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number of array size to create : ");
        int arraySize=scanner.nextInt();

        int[] num=new int[arraySize];
        System.out.println("Enter numbers : ");

        for (int i = 0; i < num.length; i++) {
            num[i]=scanner.nextInt();
        }



        for (int i = 0; i <num.length; i++) {

            num[i]*=2;

        }
        for (int i = 0; i < num.length; i++) {


            System.out.println(num[i]+"\t");
        }




    }
}
