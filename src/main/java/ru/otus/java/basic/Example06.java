package ru.otus.java.basic;


import java.util.Arrays;

public class Example06 {
    public static void main(String[] args) {
        int[] arr1 = new int[(int)(Math.random() * 10 + 2)];
        int[] arr2 = new int[(int)(Math.random() * 10 + 2)];
        int[] arr3 = new int[(int)(Math.random() * 10 + 2)];

        randomNum(arr1);
        randomNum(arr2);
        randomNum(arr3);

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));

        compareAndAdd(arr1, arr2, arr3);

    }
    public static void randomNum(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }
    }
    public static void compareAndAdd(int[] arr1,int[] arr2, int[] arr3){
        int[] maxArr = new int[Math.max(arr1.length, Math.max(arr2.length, arr3.length))];
        //System.out.println("maxArr " + Arrays.toString(maxArr));

        for (int i = 0; i < maxArr.length; i++) {
            if (arr1.length > i){
                maxArr[i] += arr1[i];
            }
            if (arr2.length > i){
                maxArr[i] += arr2[i];
            }
            if (arr3.length > i){
                maxArr[i] += arr3[i];
            }
        }
        System.out.println("maxArr " + Arrays.toString(maxArr));
    }
}
