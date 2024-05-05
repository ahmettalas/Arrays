package Diziler;

public class ikiBoyutluDiziler {
    public static void main(String[] args) {
        int borclar[][] = {{0, 100, 200}, {350, 0, 250}, {150, 500, 0}};

        int[][] borclar2 = new int[3][3];
        borclar2[0][0]=0;
        borclar2[0][1]=100;
        borclar2[0][2]=200;
        borclar2[1][0]=350;
        borclar2[1][1]=0;
        borclar2[1][2]=250;
        borclar2[2][0]=150;
        borclar2[2][1]=500;
        borclar2[2][2]=0;
        for(int satir= 0 ; satir<borclar2.length ;  satir++){
            for (int sutun = 0 ; sutun< borclar[satir].length ; sutun++){
                System.out.println("Dizinin elemanı : " + borclar[satir][sutun]);
            }

        }


    }

}