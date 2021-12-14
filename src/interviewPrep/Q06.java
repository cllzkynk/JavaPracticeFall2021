package interviewPrep;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        /*
     Create method that finds repeated characters in a String
     Bir String'de tekrarlanan karakterleri bulan method create ediniz
          */
        Scanner scan = new Scanner(System.in);
        System.out.print("String ifade giriniz : ");
        String str = scan.nextLine();

        tekrarlayanCharacterSay1(str, 'i');
        tekrarlayanCharacterSay2(str, 'd');
        tekrarlayanCharacterSayLambda(str);


    }

    public static void tekrarlayanCharacterSay1(String str, char val) {
        int count = 0;
        for (char ch : str.toCharArray()) {

            if (ch == val) {
                count++;
            }
        }
        System.out.println("tekrarlayan character : " + val + ",  tekrar sayisi : " + count);
    }

    public static void tekrarlayanCharacterSay2(String str, char val) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == val) {
                count++;
            }
        }
        System.out.println("tekrarlayan character : " + val + ",  tekrar sayisi : " + count);
    }

    public static void tekrarlayanCharacterSayLambda(String str) {
        long count = str.chars()
                .mapToObj(e -> String
                        .valueOf((char) e))
                .filter(e -> e.equals("a"))
                .count();
        System.out.println("tekrarlayan character   tekrar sayisi : " + count);
    }
    /*
    	Scanner scan =new Scanner (System.in);
		System.out.println("Please enter a sentence");
		String str=scan.nextLine();
		str=str.replaceAll(" ", ""); // String Manupaltion kullandim girilen cumle deki bosluklari da
									//    tekrar eden karakter olarak algilamasin diye bosluklari kaldirdim
		List<String> list=new ArrayList <>();
		int sayac=0;
		for (int i = 0; i < str.length()-1; i++) {

			sayac=0;

			for (int j = i+1 ; j < str.length(); j++) {
				if (str.substring(i).charAt(0) == str.substring(j).charAt(0)) {// char olarak karakterleri kiyasladim ifadeler esit olsada
																	// referans ve degerler esit olmayacagindan reel sonuc alamazdim
					sayac++;
				}

			}
			if (sayac > 0 && !list.contains(str.substring(i,i+1))) {
				// sayac'in o dan buyuk ve bir deger sartimizda list icinde tekrar eden karakterin olup olmadigina bakmamiz gerekiyor
				// eger sayac 0'da buyuk ve list icinde karakter yoksa body icine girip list'e karakteri ekliyoruz
				list.add(str.substring(i,i+1));

			}

		}
		System.out.println("Tekrar eden karakterler : "+list);
		scan.close();

	}
     */
}

