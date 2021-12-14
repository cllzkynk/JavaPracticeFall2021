package interviewPrep;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Q07 {
    /* Interview  Questions_07
     *  fibonacci dizisi
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("fibonacci dizisinin eleman sayisini giriniz : ");
        int each = scan.nextInt();

        List<Integer> fibo = new ArrayList<>();
        fibo.add(1);
        fibo.add(1);

        for (int i = 0; i < each - 2; i++) {
            fibo.add(fibo.get(i) + fibo.get(i + 1));
        }

        System.out.println(fibo);

    }
}

