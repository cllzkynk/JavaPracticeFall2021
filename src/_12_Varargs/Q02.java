package _12_Varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02 {
	public static void main(String[] args) {
		         // verilen int lerden ilki haric tum sayilari toplayan ve
				// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.
		List<Integer> sayi1 = new ArrayList<>(Arrays.asList(5,8,23,65,21,47,44,10,16));
		topla(2,34,12,45,50);
		topla(3,5,8,23,65,21,47,44,10,16);
		//topla(4,sayi1);

	}
	public static void topla(int carpilacakSayi, int... toplanacakSayilar){
		int toplam=0;

		for (int each:toplanacakSayilar)
			  {
			  	toplam+=each;

		}
		System.out.println("sonuc :"+carpilacakSayi*toplam);
	}

}
