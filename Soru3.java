package Diziler;

import java.util.Scanner;

public class Soru3
/*

        Kullanıcıdan kaç tane sayının ortalamasını bulmasını istediğini sorun ve
        buna bağlı olarak aldıgınız değerleri bir dizide saklayın. Veri alma işlemi bittikten sonra tüm
        sayıları ve ortalamasını ekrana yazdırın.

         */ {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("Kaç tane sayının ortalamasını bulmak istiyorsunuz?");
        int sayiAdet = tara.nextInt();
        double ortAlinacaklar[] = new double[sayiAdet];
        double toplam = 0;
        for (int x = 0; x < ortAlinacaklar.length; x++) {
            System.out.println("Lütfen " + (x + 1) + ".sayıyı giriniz");
            int girilenSayi = tara.nextInt();
            ortAlinacaklar[x] = girilenSayi;
            toplam = toplam + girilenSayi;
        }
        System.out.println("Girilen sayıları ortalaması : " + toplam/ ortAlinacaklar.length);
    }
}

