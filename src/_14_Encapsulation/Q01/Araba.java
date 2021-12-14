package _14_Encapsulation.Q01;

public class Araba {

  private String  model;
  private String renk;
  private int motor;
  private int yil;

  public Araba(){//p'siz cons

  }
    //getter setter methodları...sağ tık--> Generate-->Getter and Setter...
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor>=100) {
            this.motor = motor;
            System.out.println("AGAM tekerine tas degmesin  :) ");
        }else System.out.println("AGAM eglenir 100 altinda beygir gucu olmazzzz :( ");
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {

        if (yil<0) {

            this.yil = (-1)*yil;
            System.out.println( " negatif yil giremezsiniz");
        }else  this.yil = yil;

    }
    //parametreli constructor ...sağ tık--> Generate-->Constructor...
    public Araba(String model, String renk, int motor, int yil) {//p'li cons.
        // this.model = model;
        // this.renk = renk;
        // this.motor = motor;
        // this.yil = yil;-->üretilen obj nin yıl değeri buradan alırsa sete girmeden düzenlenmeden alınır
        // this.beygir = beygir;
        //cons obj parametrelerini hatalı üretmesin diye field yani dğerleri encapsule ederek get set metodlarında gönderilmeli
        // yoksa yıl volvoda hatalı -2020 girilir
        setModel(model);
        setRenk(renk);
        setMotor(motor);//üretilen obj nin motor değeri set metodundan almalı
        setYil(yil);//üretilen obj nin yıl değeri set metodundan almalı.yil verisi setYil metoduna parametre yapılarak
                    // bu verinin setYil metodu tarafından işlenmesi sağlandı
    }
}
