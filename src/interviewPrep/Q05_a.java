package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q05_a {
    public static void main(String[] args) {
        /*
         * Mauntain Array--> [0, 2, 5, 3, 1] It is constantly increasing to the maximum
         * value, decreasing constantly after the maximum value Not Mauntain Array-->
         * [5, 2, 7, 1, 4]
         *
         * Bir array elemanlari en buyuk degerine kadar surekli artan, en buyuk
         * degerinden sonra surekli azalan deger aliyorsa Mauntain Array'dir
         */
        int arr[] = {0, 2, 5, 3, 1};
        List<Integer> list = new ArrayList<>();

        for (Integer w : arr) {
            list.add(w);
        }
        System.out.println(list);//list'i yazdirdik [0, 2, 5, 3, 1]
        //Array'deki max elemani bulalim..
        Arrays.sort(arr);//Arr siralandi
        int maxEleman = arr[arr.length - 1];// arr max eleamnı maxEleman'a atandi
        System.out.println("arr'in en buyuk elemanı :" + maxEleman);// 5

        //Array'in maxElemanina kadar olan elemanlari bir liste atandi
        List<Integer> listIlk = new ArrayList<>();
        for (int i = 0; i <= list.indexOf(maxEleman); i++) {
            listIlk.add(list.get(i));
        }
        System.out.println("en buyuk elemana kadar olan elemanlar  :" + listIlk);// [0, 2, 5]
        // maxElelmana kadar olan elemanlar sirali bir liste atanip sıralandi
        List<Integer> listIlkSirali = new ArrayList<>();
        for (Integer w : listIlk) {
            listIlkSirali.add(w);
        }
        Collections.sort(listIlkSirali);
        if (listIlk.equals(listIlkSirali)) {
            System.out.println("ilk sart saglandi");
        } else System.out.println("ilk sart saglanmadi !!!!!");


        //Array'in maxElemanindan sonraki  elemanlari bir liste atandi
        List<Integer> listSon = new ArrayList<>();
        for (int i = list.indexOf(maxEleman); i < list.size(); i++) {
            listSon.add(list.get(i));
        }
        System.out.println("en buyuk elemandan sonraki kalan n elemanlar  :" + listSon);// [3, 1]
        // maxElelmandan sonraki  elemanlar sirali bir liste atanip sondan sıralandi
        List<Integer> listSonSirali = new ArrayList<>();
        for (Integer w : listSon) {
            listSonSirali.add(w);
        }

        Collections.sort(listSonSirali);
        Collections.reverse(listSonSirali);
        System.out.println(listSonSirali);
        if (listSon.equals(listSonSirali)) {
            System.out.println("ikinci sart saglandi");
        } else System.out.println("ikinci sart saglanmadi !!!!!");


        //sonuc

        if (listIlk.equals(listIlkSirali) && listSon.equals(listSonSirali)) {
            System.out.println("Array MOUNTAIN ARRAY'dir");
        } else System.out.println(" xxxx Array MOUNTAIN ARRAY degildir !!! ");

    }
}
