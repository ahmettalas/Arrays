package Diziler;
import java.util.Scanner;
public class DizilerİleOrtalamaBulmaUygulamasi {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("Kaç tane sayının ortalamasını almak istiyorsunuz?");
        int SayiAdet = tara.nextInt();
        int Sayilar[] = new int[SayiAdet];
        int toplam = 0;
        for (int i = 0; i< Sayilar.length; i++){

            System.out.println("Sayıyı giriniz...");
            Sayilar[i] = tara.nextInt();
            toplam = toplam + Sayilar[i];
        }
        System.out.println("Girdiğiniz sayıların ortalaması : " + toplam/SayiAdet);


    }
}
