package com.main;

/**
 * @author Kostenko Roman
 * Class to sort double array using quick sort.
 */
class Sorter {
    /**
     * Field that contains array to sort.
     */
    private double[] array;

    /**
     * Setter of field array.
     * @param array - array to sort.
     */
    void setArray(double[] array) {
        this.array = array;
    }

    /**
     * Method, that starts process of sorting. Throw NullPointerException, if method setArray was not called before.
     */
    void sort(){
        sort(0, array.length);
    }

    /**
     * This is a realization of the quick sort algorithm (https://en.wikipedia.org/wiki/Quicksort).
     * This method is recursion.
     *
     * @param start - The left bound of a sorting area in the array to sort.
     * @param end - The right bound of a sorting area in the array to sort.
     */
    private void sort(int start, int end) {
        if (end - start > 1) {
            int separatingElementNumber = separate(start, end);
            sort(start, separatingElementNumber);
            sort(separatingElementNumber + 1, end);
        }
    }

    /**
     * This method swaps elements of array such way, that appears separating element. A separating element is an
     * element of the array, that bigger of the all left elements and smaller of all the all rights elements.
     *
     * @param start - The left bound of a sorting area in the array to sort.
     * @param end - The right bound of a sorting area in the array to sort.
     * @return Number of a separating element.
     */
    private int separate(int start, int end){
        double separatingValue = array[end-1];
        int nextSwapNumber = start;

        for(int i = start; i<end; i++){
            if (array[i] <= separatingValue){
                swap(i, nextSwapNumber);
                nextSwapNumber ++;
            }
        }
        return nextSwapNumber-1;
    }

    /**
     * This method swaps elements with indexes i and j in the array.
     *
     * @param i - index of the first element.
     * @param j - index of the second element.
     */
    private void swap(int i, int j){
        double buffer = array[i];
        array[i] = array[j];
        array[j] = buffer;
    }
}
