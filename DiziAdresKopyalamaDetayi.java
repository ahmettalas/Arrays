package Diziler;

public class DiziAdresKopyalamaDetayi {
    public static void main(String[] args) {
        int[] sayilar = {1,2,3};
        int[] sayilarCopy = new int[sayilar.length];
        System.out.println("******************** sayilar Dizisi ********************");
        DiziYazdir(sayilar);
        System.out.println("******************** sayilarCopy dizisi ********************");
        DiziYazdir(sayilarCopy);
        System.out.println("******************** sayilarCopy dizisini sayilar dizisine eşitleyelim ( sayilarCopy = sayilar ) ********************");
        sayilarCopy = sayilar;
        System.out.println("******************* sayilarCopy dizimizi yazdıralım ********************");
        DiziYazdir(sayilarCopy);
        System.out.println("******************** sayilar dizimizi yazdiralim ********************");
        DiziYazdir(sayilar);
        System.out.println("******************** sayilar[0] = 4 yapalım ********************");
        sayilar[0] = 4;
        System.out.println("******************** simdi dizilerimizi tekrar yazdıralım.********************");
        System.out.println("sayilar dizisi :");
        DiziYazdir(sayilar);
        System.out.println("sayilarCopyDizis :");
        DiziYazdir(sayilarCopy);
        System.out.println("******************** AnaFikir olarak direkt dizi1 = dizi2 şeklinde bir komut girdiğimizde dizilerin kendisi değil adresleri atanır... ********************");
    }


    public static void DiziKopyala(int a[],int b[]){
        System.arraycopy(a,0,b,0,a.length);
    }

    public static void DiziYazdir(int[] yazdirilacakDizi){
        for(int i : yazdirilacakDizi)
            System.out.println(" Dizi Elemanı "+ i );
    }
    public static void DiziKopyala(Double a[],Double b[]){
        System.arraycopy(a,0,b,0,a.length);
    }

    public static void DiziYazdir(Double[] yazdirilacakDizi){
        for(Double i : yazdirilacakDizi)
            System.out.println(" Dizi Elemanı "+ i );
    }
    public static void DiziKopyala(String a[],String b[]){
        System.arraycopy(a,0,b,0,a.length);
    }

    public static void DiziYazdir(String[] yazdirilacakDizi){
        for(String i : yazdirilacakDizi)
            System.out.println(" Dizi Elemanı "+ i );
    }
}
