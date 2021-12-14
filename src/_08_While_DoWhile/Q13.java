package _08_While_DoWhile;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /*
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kaç adet ürün aldiğinizi giriniz: ");
        int alinanUrunSayisi = scan.nextInt();
        int toplam = 0;
        int urunFiyati = 0;
        int i = 1;
        while (i <= alinanUrunSayisi) {
            System.out.println("Lütfen aldiğiniz " + i + ". ürünün fiyatini giriniz: ");
            urunFiyati = scan.nextInt();
            i++;
            toplam += urunFiyati;
        }
        System.out.println("Müşteri kartiniz var mi? \n\n 'EVET' ya da 'HAYIR'");
        char musteriKarti = scan.next().toUpperCase().charAt(0);
        if (musteriKarti == 'E') {
            if (alinanUrunSayisi >= 10) {
                System.out.println(
                        "\nMüşteri kartiniz olduğu için alişverişinize %15 indirim uygulanmiştir. Ek olarak 10'dan fazla ürün aldiğiniz için bu indirim %20'ye yükseltilmiştir. "
                                + "\n%20 indirim sonrasi ödemeniz gereken tutar: " + (toplam - toplam * 20 / 100)
                                + " TL");
            } else {
                System.out.println(
                        "\nMüşteri kartiniz olduğu için alişverişinize %15 indirim uygulanmiştir. \n%15 indirim sonrasi ödemeniz gereken tutar: "
                                + (toplam - toplam * 15 / 100) + " TL");
            }
        } else if (musteriKarti == 'H') {
            if (alinanUrunSayisi >= 10) {
                System.out.println("\\n10'dan fazla ürün aldiğiniz için alişverişinize %15 indirim uygulanmiştir. "
                        + "\n%15 indirim sonrasi ödemeniz gereken tutar: " + (toplam - toplam * 15 / 100) + " TL");
            } else {
                System.out
                        .println("\\nBugüne özel %10 indirim kazandiniz. \n%10 indirim sonrasi ödemeniz gereken tutar: "
                                + (toplam - toplam * 10 / 100) + " TL");
            }
        }
    }
}
