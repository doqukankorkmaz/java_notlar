public class buyuk_sayi_bulma {
    public static int max(int sayi1, int sayi2){
        int buyuk_sayi;
        if(sayi1>sayi2)
            buyuk_sayi=sayi1;
        else
            buyuk_sayi=sayi2;
        return buyuk_sayi;
    }
    public static void main(String[] args) {
        System.out.println(max(7, 5));
    }
}
