package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class QMarket {
    /*
     * Bir bakkalın 7 gunluk tum kazançlarını gunluk olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi gunler ortalamanın ustune kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi gunler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Gunleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Gunluk kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngusu ile kullanıcıdan 7 gunluk kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGunleri() adlı method oluşturun.
     * 			 for döngusu ile tum gunleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yuksekse o gunleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGunleri() adlı method oluşturun.
     * 			 for döngusu ile tum gunleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o gunleri return yap.
     * */


    static List<String> gunler = new ArrayList<>(Arrays.asList(" Pazartesi", " Sali", " Carsamba", " Persembe", " Cuma", " Cumartesi", " Pazar"));//1. adım
    static List<Double> gunlukKazanclar = new ArrayList<>();//2. adım
    static double ciro = 0;

    public static void main(String[] args) {

        int gun = 0;
        Scanner sc = new Scanner(System.in);
        while (gun < 7) {//3. adım
            System.out.print(gunler.get(gun) + " gununun kazancını giriniz : ");//gunler listinden aldığım gun için kullanııcdan o gunun hasılatını istedim.
            double gunlukhasilat = sc.nextDouble();//istediğim hasılatı gunluk hasılata atadım
            gunlukKazanclar.add(gunlukhasilat);//aldığım gunluk hasılatı gunlukKazanclar listine ekledim.
            ciro += gunlukhasilat;//aldığım gunluk hasılatı kasaya ekledim.
            gun++;//0 1 2 3 4 5 6 .gunleri çağırdım.
        }
        getOrtalamaKazanc();
        getOrtalamaninUstundeKazancGunleri();
        getOrtalamaninAltindaKazancGunleri();

        System.out.println("gunlukkazanclar : " + gunlukKazanclar);
        System.out.println("ciro  : " + ciro);
        System.out.println("ortalama kazanç : " + getOrtalamaKazanc());
        System.out.println("ortalamanın ustundeki gun : " + getOrtalamaninUstundeKazancGunleri());
        System.out.println("ortalamanın altındaki gun : " + getOrtalamaninAltindaKazancGunleri());
    }

    private static String getOrtalamaninAltindaKazancGunleri() {//6. adım
        String ortAltGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) < getOrtalamaKazanc()) {
                ortAltGun += gunler.get(i);
            }
        }
        return ortAltGun;
    }

    private static String getOrtalamaninUstundeKazancGunleri() {//5.adım
        String ortUstGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > getOrtalamaKazanc()) {
                ortUstGun += gunler.get(i);
            }
        }
        return ortUstGun;
    }

    private static double getOrtalamaKazanc() {//4. adım
        double ortalama = ciro / 7;
        return ortalama;
    }
}