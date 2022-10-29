package com.java.test;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1=scanner.nextInt();

        System.out.print("Enter number 2 : ");
        int num2=scanner.nextInt();

        int value=0;

        value=num1;
        num1=num2;
        num2=value;

        System.out.println(num1);
        System.out.println(num2);




    }
}
