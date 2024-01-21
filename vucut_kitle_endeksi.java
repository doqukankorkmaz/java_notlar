import java.util.Scanner;

import org.xml.sax.SAXException;

public class vucut_kitle_endeksi {
    public static void main(String[]args){
        
         Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu (kg) girin: ");
        double kilo = scanner.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinden) girin: ");
        double boy = scanner.nextDouble();

        // BMI hesaplama
        double bmi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksi (BMI): " + bmi);

        // BMI yorumlama
        if (bmi < 18.5) {
            System.out.println("Zayıfsınız.");
        } else if (bmi < 24.9) {
            System.out.println("Normal kilodasınız.");
        } else if (bmi < 29.9) {
            System.out.println("Fazla kilolusunuz.");
        } else {
            System.out.println("Obezsiniz.");
        }


    }
}
