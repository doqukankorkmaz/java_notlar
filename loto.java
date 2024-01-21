import java.util.Random;
import java.util.Scanner;

public class loto {
    public static void main(String[] args) {
        Random random = new Random();
        int rastgeleSayi = random.nextInt(100); // 0-99 arasında rastgele bir sayı üret
        System.out.println("Rastgele Sayı: " + rastgeleSayi);
        Scanner scanner = new Scanner(System.in);
        System.out.println("0 ile 99 arasında bir sayı tahmin edin: ");
        int tahmin = scanner.nextInt();

        int birlerBasamagiRastgele = rastgeleSayi % 10;
        int onlarBasamagiRastgele = rastgeleSayi / 10;
        
        int birlerBasamagiTahmin = tahmin % 10;
        int onlarBasamagiTahmin = tahmin / 10;

        System.out.println("Rastgele Sayı: " + rastgeleSayi);

        if (tahmin == rastgeleSayi) {
            System.out.println("Tebrikler, 10.000 dolar kazandınız!");
        } else if (birlerBasamagiTahmin == onlarBasamagiRastgele && onlarBasamagiTahmin == birlerBasamagiRastgele) {
            System.out.println("İki rakamı tersten tutturdunuz, 5.000 dolar kazandınız!");
        } else if (birlerBasamagiTahmin == birlerBasamagiRastgele || onlarBasamagiTahmin == onlarBasamagiRastgele) {
            System.out.println("Bir rakamı bildiniz, 3.000 dolar kazandınız!");
        } else {
            System.out.println("Üzgünüm, hiçbir ödül kazanamadınız. Rastgele Sayı: " + rastgeleSayi);
        }
    }
}
