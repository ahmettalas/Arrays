package Diziler;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan hangi ayda olduğunu bilgisini alıp ilgili ay değerini yazdırın. Ay adlarını bir dizide saklayın.
         */
        System.out.println("Kaçıncı Ay?");
        Scanner tara = new Scanner(System.in);
        int x = tara.nextInt();
        String Aylar[]= {"Ocak" , "Şubat" , "Mart" , "Nisan" , "Mayıs" , "Haziran" , "Temmuz" , "Ağustos" , "Eylül" , "Ekim" , "Kasım" , "Aralık"};
        System.out.println("Seçtiğiniz ay : " + Aylar[x-1]);
    }
}
