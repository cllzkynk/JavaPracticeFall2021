package _14_Encapsulation.Q01;

public class ArabaMain {
    public static void main(String[] args) {
        Araba honda = new Araba();//p'siz cons honda obj create edildi
      //  honda.setMotor(1300);
      //  honda.setModel("civic");
      //  honda.setYil(20212);
      //  honda.getModel();
      //  System.out.println(honda.getYil());
        Araba volvo = new Araba("xc9o","beyaz",20,2020);
        Araba ww=new Araba("passat","kırmızı",1600,-2021);
        System.out.println("sectiginiz arac volvo -> "+"yili : "+volvo.getYil()+" renk : "+volvo.getRenk()+" motor : "+volvo.getMotor());
        System.out.println("sectiginiz arac ww -> "+"yili : "+ww.getYil()+" renk : "+ww.getRenk()+" motor : "+ww.getMotor());
        //System.out.println(volvo); --> volvo referans degerlerini yazdirir..
    }
}
