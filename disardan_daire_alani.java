import java.util.Scanner;
import static java.lang.System.out;
public class disardan_daire_alani{
    public static void main(String[] args){
        double yaricap;
        double alan;
        Scanner giris=new Scanner(System.in);
        System.out.print("lütfen yarıçap giriniz: ");
        yaricap= giris.nextDouble();
        alan=3.14*yaricap*yaricap;
        System.out.println("alan: " + alan);
    }
}
