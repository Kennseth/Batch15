package com.java.test;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("How many number you want to put : ");
        int num=scanner.nextInt();
        int value=1;
        for (int i = 1; i <=num; i++) {
            value=value*i;
        }
        System.out.println(value);






    }
}










