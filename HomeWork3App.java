/**
 * Java 1. Homework 3
 *
 * @author Denis Kononovich
 * @version 11.10.21
 */

import java.util.Arrays;
import java.util.Random;

class HomeWork3App {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        returnArrayRepeatedly(5, 3);
        findMinAndMax();
    }

    static void invertArray() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
    }

    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    static void fillDiagonal() {
        int[][] arr = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
                arr[i][j] = ((i == j) || ((i + j) == (arr.length - 1))) ? 1 : arr[i][j];
            }
        }
    }

    static void returnArrayRepeatedly(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
    }

    static void findMinAndMax() {
        int[] arr = {5, 0, -1, -69, 13, 55, 55, 3};
        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }
        }
    }
}