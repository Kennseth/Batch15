package com.java.test;


import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number of array size to create : ");
        int arraySize=scanner.nextInt();

        int[] num=new int[arraySize];
        System.out.println("Enter numbers : ");

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter a number : ");



            switch (num[i]) {
                case 12:
                    System.out.println("12");
                    break;
                case 13:
                    System.out.println("13");
                    break;
                default:
                    break;
            }
        }





    }
}
