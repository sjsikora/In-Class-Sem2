package Sorting;
import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] a = {6,2,3,7,4,1,0,9,8,5};


        selectionSort(a);
        bubbleSort(a);
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

    static void selectionSort(int[] list) {

        // For each element in the list
        for(int curr = 0; curr < list.length; curr++) {
            // Find the smallest element in the list
            int min = list[curr], minIndex = curr;
            for (int j = curr; j < list.length; j++) {

                if(list[j] < min) {
                    min = list[j];
                    minIndex = j;
                }
            }

            list[minIndex] = list[curr];
            list[curr] = min;
        }
    }

    static void bubbleSort(int[] list) {
        boolean sorted = false;

        // Loop through every element in the list
        for (int k = 0; k < list.length && !sorted; k++) {

            sorted = true;

            // For each element, compare it to the next element and swap if necessary
            for (int curr = 0; curr < list.length - 1 - k; curr++) {

                // If the current element is larger than the next element, swap them
                if(list[curr] > list[curr+1]) {
                    sorted = false;
                    int tmp = list[curr+1];
                    list[curr+1] = list[curr];
                    list[curr] = tmp;
                }

            }
            if (sorted) break;
        }
    }

    static void insertionSort(int[] list) {
        // For each element in the list (exclding the first)
        for(int i = 1; i < list.length; i++) {

            int e = list[i]; //Store the current element

            // Starting from the current element, shift-right all larger elements in sorted order
            for(int pos = i; pos > 0 && list[pos-1] > e; pos--) {
                list[pos] = list[pos-1];
            }
        }
    }

    static void mergeSort(int[] list) {
        // Pass through if list is more than one
        if (list.length > 1 ) {

            //Define the length of the two halfs
            int len1 = list.length / 2;
            int len2 = list.length - len1;
            
            //Copy the first half into a new array and rerun mergeSort on it
            int [] half1 = new int[len1];
            System.arraycopy(list, 0, half1, 0, len1);
            mergeSort(half1);

            //Copy the second half into a new array and rerun mergeSort on it
            int[] half2 = new int[len2];
            System.arraycopy(list, len1, half2, 0, len2);
            mergeSort(half2);

            //Merge the two sorted halfs into the original array
            merge(half1, half2, list);
        }
    }





    static void merge(int[] array1, int[] array2, int[] list) {

        int current = 0, i = 0, j = 0;

        while(i < array1.length && j < array2.length) {
            if(array1[i] < array2[j]) list[current++] = array1[i++];
            else list[current++] = array2[j++];
        }


    }








}