package ru.otus.java.basic;


public class Example02 {
    public static void main(String[] args) {
        System.out.println("Creating an array of random length < 100, and sum element > 5");
        int n = (int)(Math.random() * 100);
        int[] arr = new int[n];
        System.out.println("Length of array: " + n);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 10);
            if (arr[i] > 5){
                sum += arr[i];
            }
        }
        System.out.println("Sum: " + sum);
    }
}
