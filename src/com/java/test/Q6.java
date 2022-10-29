package com.java.test;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of array size to create : ");
        int arraySize = scanner.nextInt();

        String[] name = new String[arraySize];
        System.out.println("Enter numbers : ");

        for (int i = 0; i < name.length; i++) {
            name[i] = scanner.next();
        }
        for (int i = 0; i < name.length; i++) {
            System.out.print("Enter a name : ");


            switch (name[i]) {
                case "Ma Phal War":
                    System.out.println("This person is female");
                    break;
                case "Ko Tar Tay":
                    System.out.println("This person is male");
                default:
                    break;

            }
        }
    }
}
