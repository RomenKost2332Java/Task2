package com.main;

import java.util.Arrays;

public class Main {
    private static final int size = 9; // initialization of constant.

    public static void main(String[] args) {
        double[] array = new double[size]; // creating new empty array.

        fillRandomNumbers(array);
        System.out.println("Unsorted array: " + Arrays.toString(array)); // displaying unsorted array.

        sorted(array);
        System.out.println("Sorted array: " + Arrays.toString(array)); // displaying sorted array.

        if (checkSort(array)){
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is unsorted.");
        }
    }

    private static void fillRandomNumbers(double[] array){
        for(int i = 0; i<array.length; i++) // filling array by random numbers.
            array[i] = Math.random()/Math.random(); // every real positive number is a/b, where a, b from (0;1).
    }

    private static void sorted(double[] array){
        double buffer; // Sorting array, using optimizing bubble sorted algorithm
        for (int i = 0; i<array.length-1; i++){
            for (int j = 0; j<array.length-1-i; j++){
                /*
                 * Last i elements of an array is the biggest i elements of this array and they are sorted. Then last
                 * i elements aren't applied bubble sort.
                 * */
                if (array[j] > array[j+1]){
                    buffer = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buffer;
                }
            }
        }
    }

    private static boolean checkSort(double[] array){ // starting process of check sort.
        double[] copyOfArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copyOfArray);
        /*
         * The sorted array by bubble algorithm and copy of its that sorted by Arrays.sort() are been compared.
         * */
        return Arrays.equals(array, copyOfArray);
    }
}
