import java.util.Scanner;

public class loto_bul {

    /* program 0-99 arasında bir rastgele bir sayı üretecek
   kullanıcı bu sayıyı bilmeye tahmin edecek 
   eğer kullanıcı bu sayıyı bilirse 10.000 dolar kazanacak
   eğer kullanıcı sayıyı bilemez ama iki rakamıda tersten tuttruduysa 5000 dolar
   eğer kullancı bir rakamı bilirse 3000 dolar  */ 
    public static void main(String[] args){
        int r_sayi=(int)(Math.random()*100);
        System.out.println(r_sayi);
        
        Scanner input =new Scanner (System.in);
        System.out.print("sayıyı tahmin ediniz: ");
        int sayi=input.nextInt();

        int birler_bas=sayi%10;
        int onlar_bas=sayi/10;
        
        int r_birler_bas=r_sayi%10;
        int r_onlar_bas=r_sayi/10;

        if(sayi==r_sayi){
            System.out.println("tebrikler 10.000 dolar kazandınız");
        }
        else if((birler_bas==r_onlar_bas) && (onlar_bas==r_birler_bas)){
            System.out.println("tebrikler 5000 dolar kazandınız");
        }
        else if ((birler_bas==r_birler_bas)||(onlar_bas==r_onlar_bas)){
            System.out.println("tebrikler 3000 dolar kazandınız");
        }
        else{
        System.out.println("malesef şansız gün");
        }
    }
}
