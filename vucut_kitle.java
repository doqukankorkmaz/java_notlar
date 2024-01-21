import java.util.Scanner;

public class vucut_kitle {
    public static void main(String[]args){
        Scanner giris = new Scanner(System.in);
        System.out.println("pound cinsinden ağırılığınız");
        double pound=giris.nextDouble();

        System.out.println("inç cinsinden bouyunuz");
        double inc=giris.nextDouble();

        final double pound_to_kilo=0.45359237;
        final double inch_to_kg=0.0254;
        double kg =pound*pound_to_kilo; 
        double metre = inc*inch_to_kg;
        double bmi=kg/(metre*metre);
        if (bmi<=18.5){
            System.out.print("bmi değeriniz: "+bmi + " zayıfsınız");
        }
        else if (bmi<=25){
            System.out.print("bmi değeriniz: "+bmi + " normalsiniz");
        }
        else if (bmi<=30){
            System.out.print("bmi değeriniz: "+bmi + " şişman");
        }
        else{
          System.out.print("bmi değeriniz: "+bmi + " obez");  
        }
        
    }
}
