import java.util.Scanner;
public class saniye_dakika {
    public static void main(String[] args){
        Scanner giris = new Scanner (System.in);
        System.out.print("saniye giriniz: ");
        int saniye = giris.nextInt();
        int dakika = saniye / 60;
        int artiksaniye = saniye % 60;
        System.out.println(dakika+ " dakika eder ve " +artiksaniye+ " artık saniye eder");

    }
}
