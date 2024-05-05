package Diziler;

public class Soru1 {
    public static void main(String[] args) {
        // 10 elemanlı bir diziye dizi indexinin karesini atayan uygulama.
        int a[] = new int[10];
        for (int x = 0 ; x< a.length; x++){
            a[x] = x*x;
            System.out.println(x + ". elemana " + x*x + " değeri atandı.");
        }

    }
}
