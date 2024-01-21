import java.util.Scanner;

public class tekrarlı_toplam_bulma {
    public static void main(String[] args) {
      int sayi1 = (int)(Math.random() * 100);
    int sayi2 = (int)(Math.random() * 100);
    Scanner input = new Scanner(System.in);
    System.out.print(sayi1 + "+" + sayi2 + "işleminin sonucu nedir?:");
    int cevap = input.nextInt();
    while(cevap != sayi1+sayi2) {
      System.out.println("Yanlış cevap");
      System.out.print(sayi1 + "+" + sayi2 + "işleminin sonucu nedir?:");
      cevap = input.nextInt();
    }
    System.out.println("Doğru cevap, tebrikler");  
    }
    
}
