import java.util.Scanner;

public class indirim_hesaplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("fiyat: ");
        int fiyat=input.nextInt();
        double indirim;

        if(fiyat>=750){
            indirim=fiyat-(fiyat*0.45);
            System.out.println("inidirimli hali: "+ indirim);

        }
        if(fiyat>250 && fiyat<750){
            indirim=fiyat-(fiyat*0.35);
            System.out.println("indirimli fiyat: "+ indirim);
        }
        if(fiyat>0 && fiyat<=250){
            indirim=(fiyat);
            System.out.println("bir alana bir bedava, 2 ürün fiyatı: "+fiyat);
        }
        if(fiyat<0){
            System.out.print("hatalı değer girdiniz");
        }

}
}
