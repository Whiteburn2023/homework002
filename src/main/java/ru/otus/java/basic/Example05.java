package ru.otus.java.basic;


import java.util.Arrays;

public class Example05 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100);
        System.out.println("Length of array: " + n);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("Array: " + Arrays.toString(arr));
        halfVsHalf(arr);

    }

    public static void halfVsHalf(int[] arr) {
        int firstHalf = 0;
        int secondHalf = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            firstHalf += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            secondHalf += arr[i];
        }
        if (firstHalf > secondHalf) {
            System.out.println("The first half is bigger: " + firstHalf + " > " + secondHalf);
        } else if (firstHalf < secondHalf) {
            System.out.println("The second half is bigger: " + firstHalf + " < " + secondHalf);
        } else {
            System.out.println("Draw: " + firstHalf + " = " + secondHalf);
        }
    }
}
