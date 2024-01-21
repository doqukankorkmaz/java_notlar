import java.util.Scanner;
import static java.lang.System.out;
public class uc_sayi_ort{
    public static void main(String[] args){
        double sayi1,sayi2,sayi3;
        double ort;
        Scanner giris=new Scanner(System.in);

        System.out.print("sayi1: ");
        sayi1 = giris.nextDouble();
        System.out.print("sayi2: ");
        sayi2 = giris.nextDouble();    
        System.out.print("sayi3: ");
        sayi3 = giris.nextDouble();
        ort=(sayi1+sayi2+sayi3)/3;
        System.out.println("ortalama: " + ort);
    }
}

/*Identifiers(tanımlayıcılar
*tanımlayıcılar alfabetik karakterler, rakamlar, _ , ve $ sembollerden oluşur.
*bir tanımlayıcı, harfle ,_ , veya $ ile başlar
*/