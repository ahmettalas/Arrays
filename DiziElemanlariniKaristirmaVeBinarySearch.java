package Diziler;

public class DiziElemanlariniKaristirmaVeBinarySearch {
    public static void main(String[] args){







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

