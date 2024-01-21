import java.util.Scanner;

public class rastgele_sayilar_toplamı {
    public static void main(String[] args){
        int sayi1=(int)(System.currentTimeMillis()%10);
        int sayi2=(int)(System.currentTimeMillis() / 10 % 10);
        Scanner input=new Scanner(System.in);
        System.out.print("what is "+ sayi1 +" + "+sayi2+" = ");
        int answer = input.nextInt();
        System.out.println(sayi1 + " + " + sayi2 + " = "+ answer +" is "+ (sayi1+sayi2==answer));
    
    }
}
