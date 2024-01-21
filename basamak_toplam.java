import java.util.Scanner;

public class basamak_toplam {
    public static void main(String[] args){
        
        /* 
         Scanner input = new Scanner(System.in);
         System.out.print("değer giriniz(1-999): ");
         int sayi=input.nextInt();

         if(sayi>=1 && sayi<=999){
            int birler=sayi%10;
            int arasayi=sayi/10;
            int onlar=arasayi%10;
            int yuzler=arasayi/10;
            System.out.println(birler+onlar+yuzler);
         }
         else{
            System.out.println("Hatalı sayı girdiniz");
         }
         */
        
          Scanner input = new Scanner(System.in);
         System.out.print("değer giriniz(1-999): ");
         int sayi=input.nextInt();
         int toplam=0;
         while(sayi!=0){
            toplam=toplam+sayi%10;
            sayi=sayi/10;
         }
         System.out.print("basamak toplam: "+ toplam);
         



    }}