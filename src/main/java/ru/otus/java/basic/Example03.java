package ru.otus.java.basic;


import java.util.Arrays;
import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: 9");
        int n = sc.nextInt();
        int[] arr = new int[n];
        myCeil(n, arr);

    }
    public static void myCeil(int n, int[] arr){
        for (int i = 0; i < n; i++) {
            arr[i] = n;
        }
        System.out.println(Arrays.toString(arr));
    }
}
