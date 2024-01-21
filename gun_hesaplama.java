import java.util.Scanner;
public class gun_hesaplama {
    public static void main(String[] args){
        int pazartesi=1,sali=2,carsamba=3,persembe=4, cuma=5, cumartesi=6,pazar=7;
        Scanner giris = new Scanner (System.in);
        int gun=(pazartesi+101)%7;
        if(gun==1){
            System.out.println("pazartesi");
        } 
        if(gun==2){
            System.out.println("salı");
        }
        if(gun==3){
            System.out.println("çarşamba");
        }
        if(gun==4){
            System.out.println("perşembe");
        }
        if(gun==5){
            System.out.println("cuma");
        }
        if(gun==6){
            System.out.println("cumartesi");
        }
        if(gun==7){
            System.out.println("pazar");
        }



    }
}
