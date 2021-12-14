package _04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Bugune göre 100 gun sonra hangi gun olduğunuz yazdiriniz.
        // pazartesi
        Scanner scan = new Scanner(System.in);
        System.out.print(
                "Pazartesi: 1 \nSali: 2 \nÇarşamba: 3 \nPerşembe: 4 \nCuma: 5 \nCumartesi: 6 \nPazar: 7 \nLutfen haftanin kaçinci gununde olduğunuzu yazin: ");
        int kancinciGun = scan.nextInt();
        System.out.println("Lutfen kaç gun sonrasini merak ettiğinizi yazin :");
        int kacGun = scan.nextInt();
        int hangiGun = (kacGun % 7 + kancinciGun) % 7;
        if (kancinciGun <= 7 && kancinciGun > 0) {
            if (kacGun > 0) {
                switch (hangiGun) {
                    case 1: {
                        System.out.println(kacGun + " gun sonra gunlerden Pazartesi.");
                        break;
                    }
                    case 2: {
                        System.out.println(kacGun + " gun sonra gunlerden Sali.");
                        break;
                    }
                    case 3: {
                        System.out.println(kacGun + " gun sonra gunlerden Çarşamba.");
                        break;
                    }
                    case 4: {
                        System.out.println(kacGun + " gun sonra gunlerden Perşembe.");
                        break;
                    }
                    case 5: {
                        System.out.println(kacGun + " gun sonra gunlerden Cuma.");
                        break;
                    }
                    case 6: {
                        System.out.println(kacGun + " gun sonra gunlerden Cumartesi.");
                        break;
                    }
                    case 7: {
                        System.out.println(kacGun + " gun sonra gunlerden Pazar.");
                        break;
                    }
                }
            } else {
                System.out.println("Geçmiş geçmişte kaldi :)");
            }
        } else {
            System.out.println("Hafta 7 gun dostum!");
        }
    }
}

