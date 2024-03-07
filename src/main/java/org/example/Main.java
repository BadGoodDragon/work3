package org.example;

import org.example.Sort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Watch watch = new Watch();
        int[] arr = {};

        arr = generateRandomArray(100, 0, 10000);
        System.out.println("bubbleSort 100");
        watch.start();
        Sort.bubbleSort(arr);
        System.out.println(watch.end());

        arr = generateRandomArray(100, 0, 10000);
        System.out.println("insertionSort 100");
        watch.start();
        Sort.insertionSort(arr);
        System.out.println(watch.end());

        arr = generateRandomArray(100, 0, 10000);
        System.out.println("quickSort 100");
        watch.start();
        Sort.quickSort(arr, 0, arr.length - 1);
        System.out.println(watch.end());

        System.out.println("\n\n");

        arr = generateRandomArray(1000, 0, 10000);
        System.out.println("bubbleSort 1000");
        watch.start();
        Sort.bubbleSort(arr);
        System.out.println(watch.end());

        arr = generateRandomArray(1000, 0, 10000);
        System.out.println("insertionSort 1000");
        watch.start();
        Sort.insertionSort(arr);
        System.out.println(watch.end());

        arr = generateRandomArray(1000, 0, 10000);
        System.out.println("quickSort 1000");
        watch.start();
        Sort.quickSort(arr, 0, arr.length - 1);
        System.out.println(watch.end());

        System.out.println("\n\n");

        arr = generateRandomArray(10000, 0, 10000);
        System.out.println("bubbleSort 10000");
        watch.start();
        Sort.bubbleSort(arr);
        System.out.println(watch.end());

        arr = generateRandomArray(10000, 0, 10000);
        System.out.println("insertionSort 10000");
        watch.start();
        Sort.insertionSort(arr);
        System.out.println(watch.end());

        arr = generateRandomArray(10000, 0, 10000);
        System.out.println("quickSort 10000");
        watch.start();
        Sort.quickSort(arr, 0, arr.length - 1);
        System.out.println(watch.end());
    }

    public static int[] generateRandomArray(int length, int min, int max) {

        int[] arr = new int[length];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;
        }

        return arr;
    }


    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}