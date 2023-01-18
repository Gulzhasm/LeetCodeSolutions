package me.decentos.leetcode.sorting.based;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = i;
            while (curr > 0 && arr[curr - 1] > arr[curr]) {
                int temp = arr[curr];
                arr[curr] = arr[curr - 1];
                arr[curr - 1] = temp;
                curr--;
            }
        }
    }
}
