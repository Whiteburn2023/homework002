package ru.otus.java.basic;


import java.util.Arrays;

public class Example07 {
    public static void main(String[] args) {
        int n = (int)(Math.random() * 10 + 2);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 10);
        }
        System.out.println("n: " + n + " arr: " + Arrays.toString(arr));
        int sumI = 0;
        int sumJ;
        for (int i = 0; i < arr.length - 1; i++) {
            sumI += arr[i];
            sumJ = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sumJ += arr[j];
            }
            System.out.println("sumI: " + sumI + " sumJ: " + sumJ);
            point(sumI, sumJ);
            if (sumI > sumJ){
                System.out.println("no point is equality ");
                return;
            }
        }
    }
    public static void point(int sumI, int sumJ){
        if (sumI == sumJ){
            System.out.println("the point of equality exists");
        }
    }
}
