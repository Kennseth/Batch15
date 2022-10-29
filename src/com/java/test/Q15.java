package com.java.test;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number of array size to create : ");
        int arraySize=scanner.nextInt();

        int[] numbers=new int[arraySize];
        System.out.println("Enter numbers : ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
        }
        int even=0,odd=0;


        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0){
                for (int i1 = 0; i1 < numbers.length; i1++) {
                    even+=numbers[i1];
                    System.out.println(even);
                }


                }else {
                for (int i1 = 0; i1 < numbers.length; i1++) {
                    odd+=numbers[i1];
                    System.out.println(odd);
                }


                }




        }

    }
}
