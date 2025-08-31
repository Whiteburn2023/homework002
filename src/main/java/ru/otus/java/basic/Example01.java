package ru.otus.java.basic;


import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the line:");
        String str = sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
}
