package ch05.sec06;

public class MultiArrayStudy {
/*
int[] arr1 = {10, 20, 30};
int[] arr2 = {40, 50, 60};
int[][] parent = { arr1, arr2 };




 */

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60};
        int[] arr3 = {70, 80, 90};
        int[][] parent = { arr1, arr2, arr3 };
        System.out.println(parent[2][2]);
    }
}
