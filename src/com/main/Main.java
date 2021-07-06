package com.main;

public class Main {

    public static void main(String[] args) {
        final int size = 100;

        double[] array = new double[size];

        for(int i = 0; i<array.length; i++)
            array[i] = Math.random()/Math.random();

        double[] bubbleSortedArray = array;
        double buffer;
        for (int i = 0; i<bubbleSortedArray.length-1; i++){
            for (int j = 0; j<bubbleSortedArray.length-1-i; j++){
                if (bubbleSortedArray[j] > bubbleSortedArray[j+1]){
                    buffer = bubbleSortedArray[j];
                    bubbleSortedArray[j] = bubbleSortedArray[j+1];
                    bubbleSortedArray[j+1] = buffer;
                }
            }
        }

        for (double e : bubbleSortedArray){
            System.out.println(e);
        }
    }
}
