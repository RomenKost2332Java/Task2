package com.main;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final int size = 9; // initialization of constant.

        double[] array = new double[size]; // creating new empty array.

        for(int i = 0; i<array.length; i++) // filling array by random numbers.
            array[i] = Math.random()/Math.random(); // every real positive number is a/b, where a, b from (0;1).
        System.out.println("Unsorted array: " + Arrays.toString(array)); // displaying unsorted array.

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

        System.out.println("Sorted array: " + Arrays.toString(array)); // displaying sorted array.

        System.out.print("Check sort ... "); // starting process of check sort.

        double[] copyOfArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copyOfArray);
        /*
        * The sorted array by bubble algorithm and copy of its that sorted by Arrays.sort() are been compared.
        * */
        if (Arrays.equals(array, copyOfArray))
            System.out.println("OK");
        else System.out.println("UPS"); // displaying status of checking on the screen.
    }
}
