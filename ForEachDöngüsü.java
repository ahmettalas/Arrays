package Diziler;

public class ForEachDöngüsü {
    public static void main(String[] args) {
        int sayilar[]={1,2,3};
        for(int a : sayilar)
            System.out.println("ForEach eleman " + a);
        ForEachDongusu();
        int[] sayilar2 = {1,2,3};
        for(int i : sayilar2)
            System.out.println("Sayilar 2 dizisi eleman " + i);




    }
    public static void ForEachDongusu() {
        int[] rakamlar = {0,1,2,3,4,5,6,7,8,9};
        for(int x : rakamlar)
            System.out.println("ForEach Döngüsü rakam : " + x);
    }


}
