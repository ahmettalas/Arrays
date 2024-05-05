package Diziler;

public class DiziyiEkranaYazdirmaMetodu {
    public static void main(String[] args) {
        int sayilar[]={1,2,3,4,5,6,7,8};

    diziYazdir(sayilar);

    }
    public static void diziYazdir(int dizi[]) {
        for(int a : dizi)
            System.out.println("ForEach Döngüsü ile diziYazdir metodu elemanı " + a);
    }
}

