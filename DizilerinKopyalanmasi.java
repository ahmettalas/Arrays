package Diziler;

public class DizilerinKopyalanmasi {
    public static void main(String[] args) {
        /*
        int sayilar[] = {1, 2, 3};
        int sayilarCopy[] = new int[sayilar.length];
        for (int index = 0; index < sayilar.length; index++) {
            sayilarCopy[index] = sayilar[index];
        }
       diziYazdir(sayilarCopy);
        //ArrayCopy
        int[] kopyaDizi = new int[sayilar.length];
        System.arraycopy(sayilar, 0, kopyaDizi, 0, sayilar.length);
//     arraycopy  (kaynakDizi, hangiElemandanBaslanacak, hedefDizi, hangiElemandanBaslanacak,kacElemanKopyalanacak);
        diziYazdir(kopyaDizi);



        */




        int[] rakamlar = {0,1,2,3,4,5,6,7,8,9};
        int[] rakamlarKopya = new int[rakamlar.length];
        System.arraycopy(rakamlar,0,rakamlarKopya,0,rakamlar.length);
        for(int rakamlarKopyaEleman : rakamlar)
            System.out.println("rakamlarKopyaElaman " + rakamlarKopyaEleman);









    }
    public static void intDiziKopyala(int a[],int b[]){
        System.arraycopy(a,0,b,0,a.length);
        System.out.println("Başarılı bir şekilde kopyalandı");
    }

    public static void intDiziYazdir(int[] yazdirilacakDizi){
        for(int i : yazdirilacakDizi)
            System.out.println(" Dizi Elemanları "+ i );
    }
    /*
//Dizi yazdir metodu oluşturmak
public static void diziYazdir(int[] yazdirilacakDizi) {
for(int i2 : yazdirilacakDizi)
    System.out.println("Dizinin elemanı : "+i2);


}


     */
}
