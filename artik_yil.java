import java.util.Scanner;

public class artik_yil {
  public static void main(String[] args){
   /* artık yıl olmak için aşağıdaki koşullardan en az birisini sağlamalıdır
   4 sayısına tam bölünür fakat 100 sayısnına tam bölünmez
   400 sayısına tam bölünür */ 
    Scanner input = new Scanner(System.in);
        System.out.print("yil giriniz: ");
        int yil=input.nextInt();
        if((yil%4==0 && yil%100!=0) || (yil%400==0)){
            System.out.println("artık yıldır");
        }
        
        else {
            System.out.println("artık yıl değildir");
        }

  }  
}

/* program 0-99 arasında bir rastgele bir sayı üretecek
   kullanıcı bu sayıyı bilmeye tahmin edecek 
   eğer kullanıcı bu sayıyı bilirse 10.000 dolar kazanacak
   eğer kullanıcı sayıyı bilemez ama iki rakamıda tersten tuttruduysa 5000 dolar
   eğer kullancı bir rakamı bilirse 3000 dolar  */ 
