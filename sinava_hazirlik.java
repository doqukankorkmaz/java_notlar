import java.util.Scanner;

public class sinava_hazirlik {
    public static void main(String[] args) {
        
        int sayi1 = (int) (Math.random() * 100) + 1;
       int sayi2 = (int) (Math.random() * 100) + 1;
       int buyuk, kucuk;
       if(sayi1 >= sayi2) {
         buyuk = sayi1;
         kucuk = sayi2;
       }
       else {
         buyuk = sayi2;
         kucuk = sayi1;
       }
       Scanner giris = new Scanner(System.in);
       System.out.print(buyuk + "-" + kucuk + "=");
       int cevap = giris.nextInt();
       if(cevap == buyuk - kucuk) {
         System.out.println("Tebrikler, bildiniz");
       }
       else {
         System.out.println("Bilemediniz, doğru cevap "+ (buyuk - kucuk));
       }
        
    
    }
}

