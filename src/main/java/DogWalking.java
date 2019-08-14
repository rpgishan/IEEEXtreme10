/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ieeextreme10;

import java.util.Scanner;

/**
 *
 * @author Gishan
 */
public class DogWalking {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t, n, k;
        t = s.nextInt();
        n = s.nextInt();
        k = s.nextInt();
        int[] tcar = new int[t];
        int[][] dgar = new int[n][3];
        for (int i = 0; i < tcar.length; i++) {
            if (k == n) {
                tcar[i] = 0;
            }
            for (int j = 0; j < n; j++) {
                dgar[j][0] = s.nextInt();
            }
            quickSort(dgar, i, i);

        }

    }

    public static void getMin(int[][] arr, int size) {
        if (arr.length > 1) {
            int min, tempmin;
            for (int i = 1; i < size - 1; i++) {
                min = Math.abs(arr[i][0] - arr[i - 1][0]);
                arr[i][1] = i - 1;
                tempmin = Math.abs(arr[i + 1][0] - arr[i][0]);
                if (min > tempmin) {
                    min = tempmin;
                    arr[i][1] = i + 1;
                    i++;
                }

            }
        }
    }
    
    

    public static void quickSort(int[][] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle][0];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i][0] < pivot) {
                i++;
            }

            while (arr[j][0] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i][0];
                arr[i][0] = arr[j][0];
                arr[j][0] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j) {
            quickSort(arr, low, j);
        }

        if (high > i) {
            quickSort(arr, i, high);
        }
    }
}
