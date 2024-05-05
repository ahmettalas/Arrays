package Diziler;

public class MetotlaraSayiGondermekVeAlmak {
    public static void main(String[] args) {
        int[] sayilar = {1,2,3};
        System.out.println("**************** değerler ellenmeden önce sayilar[0] ****************");
        sayiyiGoster(sayilar[0]);
        System.out.println("****************metod kullanarak 1 arttıktan sonra sayilar[0] ****************");
        sayiyiBirArttir(sayilar[0]);
        sayiyiGoster(sayilar[0]);
        System.out.println("**************** Değerler ellenmeden önce sayılar dizisi ****************");
        diziGoster(sayilar);
        System.out.println("**************** metod kullanarak Değerler 1 arttıktan sonra sayılar dizisi ****************");
        diziyiBirArttir(sayilar);
        diziGoster(sayilar);
    }

    public static void sayiyiGoster(int sayi){
        System.out.println("Sayi : " +sayi);
    }
    public static void diziyiBirArttir (int[] gonderilenDizi){
        gonderilenDizi[0]++;
        gonderilenDizi[1]++;
        gonderilenDizi[2]++;
    }
    public static void sayiyiBirArttir(int a) {
        a++;
    }
    public static void diziGoster(int[] gonderilerDizi) {
        for (int oankisayi : gonderilerDizi)
            System.out.println("Gönderilen dizinin elemanı : " + oankisayi);
    }
}
