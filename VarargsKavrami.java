package Diziler;

public class VarargsKavrami {
    public static void main(String[] args) {
        int[] sayilar = {1, 2, 3};

        toplaminiBul(1,2,3,4,5,65,5,1,15,54);
        toplaminiBul(sayilar[1],sayilar[0],sayilar[2]);

    }


    public static void toplaminiBul(int... parametreler) {                                     //metod overloading
        int toplam = 0;
        for(int oAnkiSayi : parametreler){
            toplam += oAnkiSayi;
        }
        System.out.println("Girilen Parametrelerin toplamı : " +toplam);


    }
}

