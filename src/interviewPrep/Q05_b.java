package interviewPrep;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_b {
    public static void main(String[] args) {
        /*
         * Mauntain Array--> [0, 2, 5, 3, 1] It is constantly increasing to the maximum
         * value, decreasing constantly after the maximum value Not Mauntain Array-->
         * [5, 2, 7, 1, 4]
         *
         * Bir array elemanlari en buyuk degerine kadar surekli artan, en buyuk
         * degerinden sonra surekli azalan deger aliyorsa Mauntain Array'dir
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Aralarında boşluk bırakarak arr elemanlarını girin :");
        String eleman = scan.nextLine();
        String arr1[] = eleman.split(" ");
        int arr[] = new int[arr1.length];
        int i = 0;
        for (String a : arr1) {
            arr[i] = Integer.parseInt(a);
            i++;
        }
        boolean sonuc = false;
        sonuc = mauntain(arr);
        if (sonuc) {
            System.out.println(Arrays.toString(arr) + " dizisi Mauntain Array 'dir");
        } else {
            System.out.println(Arrays.toString(arr) + " dizisi Mauntain Array degildir");
        }
    }

    private static boolean mauntain(int[] arr) {
        int sol = 0;
        int sag = arr.length - 1;
        if (sag >= 2) {
            while (sol + 1 < sag && arr[sol] < arr[sol + 1])
                sol++;
            while (sag - 1 > 0 && arr[sag] < arr[sag - 1])
                sag--;
        }
        return true;
    }
}
