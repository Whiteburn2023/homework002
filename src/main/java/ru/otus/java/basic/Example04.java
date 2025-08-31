package ru.otus.java.basic;


import java.util.Arrays;
import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n;
        }
        System.out.println("Before: " + Arrays.toString(arr));
        myArr(n, arr);
    }

    public static void myArr(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            arr[i] += n;
        }
        System.out.println("After: " + Arrays.toString(arr));
    }
}
