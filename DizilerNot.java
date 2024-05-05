package Diziler;

public class DizilerNot {
    /*
    - İçerisinde belli bir sayıda ve aynı tür veri olan yapılara dizi denir.

    - Diziler oluşturulduğunda heap alanına 10 adet değer saklayacak bir alan oluşturulur
      ve bu alana da veri tiplerinin varsayılan değerleri atanır.

    - Dizide index değerleri sıfırdan başlar bu yüzden bir dizinin alabileceği max index değeri
      eleman sayısının 1 eksiği kadardır.

    - Ayrıca double[] veriler = {3,4, 5,1, 2,3} şeklinde de diziyi oluşturabilirsiniz.

    - Dizideki elemanları gezmek,kullanmak için genellikle for döngüsü kullanılır.

    - 10 elemanlı integer bir dizideki tüm elemanları yazdırırsak;

                    for(int i=0; i<dizi.length ; i++){
	                              System.out.println(i+". indeksteki eleman:" + dizi[i]);
                                       }
    - Dizi bir kere tanımlanır,sonrasında tutacağı elemanları değiştirebilirsiniz fakat
     dizinin tutacağı eleman sayısını değiştiremezsiniz.

    - int sayilar[] = new int[10]; 10 elemanlı bir integer dizi oluşturur.

    - int sayilar[] = new int[15]; eski sayilar dizisi silinip yeni bir dizi oluşturulur
      eski dizinin genişletildiğini düşünmeyin tamamen yeni bir dizi oluşturulur.



   -------------------- VERİLER NASIL TUTULUR? --------------------------

 Yığın(Stack) : Bellekte yani RAM'de bulunur.
   Oldukça hızlı çalışan, doğrudan işlemciden donanım desteğine sahip olan alandır.
   Java derleyicisi program oluşturulmadan önce buraya konulacak verileri ve büyüklüklerini bilmelidir.
   İlkel veri tipleri o yüzden burada tutulur. Çünkü hepsinin bellekte tutacağı alan sabit ve bellidir.
   Ama dizi veya nesnelerin ne kadar yer tutacağı belli olmadığı için burada sadece referansları yer alır.
   Bu referansların değerleri ise heap alanında bulunan gerçek değerin adres bilgisidir.

 Heap  : Derleyici buradaki değerlerin ne kadar bellek ihtiyacı olduğunu bilmek zorunda değildir.
   Biz ne zaman new deyip yeni bir dizi veya nesne oluşturmak istersek bu alanda bize yer verilir.
   Diziler veya nesnelerin gerçek değerleri burada saklanır.
   Bu özgürlüklerin bize maaliyeti ise yığına göre daha yavaş olmasıdır.























     */
}
