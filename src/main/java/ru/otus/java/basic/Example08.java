package ru.otus.java.basic;


import java.util.Arrays;
import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = (int) (Math.random() * 2 + 2);
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = (int) (Math.random() * 10);
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("choose ascending (enter - 1) or descending (enter - 2) order, 0 - exit");
            int num = sc.nextInt();
            if (num == 1) {
                getAscending(arr);
            } else if (num == 2) {
                getDescending(arr);
            } else if (num == 0) {
                break;
            } else {
                System.out.println("incorrect input");
            }
        }
    }

    private static void getAscending(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                ++count;
            }
        }
        toPrint(count == arr.length - 1);
    }

    private static void getDescending(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                ++count;
            }
        }
        toPrint(count == arr.length - 1);
    }

    private static void toPrint(boolean result) {
        System.out.println(result ? "Yes" : "No");
    }
}
