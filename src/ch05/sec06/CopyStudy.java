package ch05.sec06;

public class CopyStudy {
    public static void main(String[] args) {
//        int[] arr1 = new int[10];
        int [] arr = { 10, 20, 30 };
//        int[] arr2 = new int [] { 10, 20, 30 };
        int[] temp = arr;
        temp[1] = 200;

        System.out.println(arr[1]);
    }
}
