package com.java.test;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter num 1 : ");
        int x=scanner.nextInt();

        System.out.print("Enter num 2 : ");
        int y=scanner.nextInt();

        if(x>y){
            System.out.println("x is greater than y");
        } else if (x==y) {
            System.out.println("x is equal to y");

        }else {
            System.out.println("x is less than y");
        }
    }
}
