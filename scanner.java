import java.util.Scanner;
public class scanner {
    public static void main(String[]args){
        Scanner giris = new Scanner(System.in);
        System.out.print("not girin: ");
        long notu=giris.nextLong();
        System.out.println("notu: "+notu);
        //bu tarz durumlarda long kullanmak mantıksınz boşna alanda fazlayer kaplar
    }
}
