package _11_Debuging;

public class Debug01 {
    /*
      Debug yapiyorsan, kodu anlamadin demektir.
    Debug yaparken kodu anlamiyorsan, nasil debug yapilir, onu anlamadin demektir.
    Debug yaparken kodu anladigini dusunuyorsan, aslinda debuga ihtiyacin olmadigini anladin demektir.
    Debug etmek kodun mental bir modelinin eksikligine isarettir..


    İki durumda debugger gerekli olabilir:
    Mevcut kod devralındığında.
    Yeni kod yazıldığında.
    her iki durumda da debugger çalıştırmamaya dikkat edilmeli.
    Amac sıfır debug aktivitesi ile uygulamayı istenilen seviyeye getirebilmek.
     */

  static  int global=7;
    public static void main(String[] args) {

        dongu1();
    }

    private static void dongu1() {
        global++;
        int a=0;
        for (int i = 1; i <=10; i++){
            System.out.print( i+" ");
            a=3*i;
        }
        System.out.println(" --> 1. dongu");
        dongu2();
        dongu3();
    }
    private static void dongu3() {
        global+=5;
        for (int x = 1; x <=7; x++){
            System.out.print( x+" ");
        }
        System.out.println(" --> 3. dongu");
    }
    private static void dongu2() {
        global-=3;
        for (int y = 1; y <=3; y++){
            System.out.print( y+" ");
        }
        System.out.println(" --> 2. dongu");
    }
}
