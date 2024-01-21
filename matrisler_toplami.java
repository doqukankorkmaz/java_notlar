import java.util.IllegalFormatWidthException;
import java.util.Scanner;

public class matrisler_toplami {
    public static void main(String[] args){
     /*  int[][] dizi=new int[2][3];
      System.out.println(dizi[0][1]);//0
      */



        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Satır sayısını girin: ");
        int satir_sayisi = scanner.nextInt();

        System.err.print("sütun sayısını giriniz: ");
        int sutun_sayisi=scanner.nextInt();

       int[][]matris1=new int[satir_sayisi][sutun_sayisi];
       System.out.println("1. Matris elemanları");
       for (int i = 0; i < satir_sayisi; i++) {
           for (int j = 0; j < sutun_sayisi; j++) {
               System.out.print("matris1[" + i + "][" + j + "]: ");
               matris1[i][j] = scanner.nextInt();
           }
       }
       
        
        int[][] matris2 = new int[satir_sayisi][sutun_sayisi];
        System.out.println("2. Matris elemanlarını girin:");

        for (int i = 0; i < satir_sayisi; i++) {
            for (int j = 0; j < sutun_sayisi; j++) {
                System.out.print("matris2[" + i + "][" + j + "]: ");
                matris2[i][j] = scanner.nextInt();
            }
        }

        
        int[][] toplam_matris = new int[satir_sayisi][sutun_sayisi];

        for (int i = 0; i < satir_sayisi; i++) {
            for (int j = 0; j < sutun_sayisi; j++) {
                toplam_matris[i][j] = matris1[i][j] + matris2[i][j];
            }
        }

        
        System.out.println("Toplam Matris:");
        for (int i = 0; i < satir_sayisi; i++) {
            for (int j = 0; j < sutun_sayisi; j++) {
                System.out.print(toplam_matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}

