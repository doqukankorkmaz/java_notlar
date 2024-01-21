import java.util.Scanner;

public class tekrarlayarak_random_toplamını_bulma {
    public static void main(String[] args) {
        int sayi = (int) (Math.random() * 100) + 1;
        int sayi2= (int)(Math.random()*100)+1;

        Scanner input = new Scanner(System.in);
        int toplam=0;
        while (true){
            System.out.print(sayi+"+"+sayi2+"=");
            toplam = input.nextInt();
            
            if(toplam==sayi+sayi2){
                System.out.println("doğru cevap");
                break;
            }
            else{
                System.out.println("hatalı cevap");
            }
        }
        
    }
}
