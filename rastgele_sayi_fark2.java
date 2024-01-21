import java.util.Scanner;

public class rastgele_sayi_fark2 {
    public static void main(String[] args) {
    int buyuk = (int) (Math.random() * 100) + 1;
    int kucuk = (int) (Math.random() * 100) + 1;
    int temp;
    if(kucuk > buyuk) {
      temp = kucuk;
      kucuk = buyuk;
      buyuk = temp;
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
