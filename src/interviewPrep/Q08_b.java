package interviewPrep;

import java.util.Arrays;
import java.util.Scanner;

public class Q08_b {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki String girinz");
        String first = scan.nextLine().toLowerCase(), second = scan.nextLine().toLowerCase();

        System.out.println(isAnagram(first, second) ? "Anagram" : "Anagram Degil");

    }

    public static boolean isAnagram(String s1, String s2) {

        String first[] = s1.split("");
        Arrays.sort(first);

        String second[] = s2.split("");
        Arrays.sort(second);

        return Arrays.equals(first, second);

    }
}
