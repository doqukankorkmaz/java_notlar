import java.util.Scanner;

public class sayi_0_olunca_topla {
    public static void main(String[] args) {
        int toplam=0;

   Scanner input=new Scanner(System.in);
       while(true){
 System.out.print("sayı giriniz:");
       int sayi=input.nextInt();
       if(sayi==0){
        break;
       }
       else{
        toplam+= sayi;
       }
       
    }
    System.out.println("toplam= "+toplam);

       
      
        /*
            Scanner giris = new Scanner(System.in);
    System.out.print("Bir tamsayı giriniz(Toplamı görmek için 0 giriniz : ");
    int toplam = 0;
    int sayi = giris.nextInt();
    while(sayi!=0) {
      toplam += sayi;
      System.out.print("Bir tamsayı giriniz(Toplamı görmek için 0 giriniz : ");
      sayi = giris.nextInt();
    }
    System.out.println("Sayıların toplamı : " + toplam);
         */
    

    }
}
