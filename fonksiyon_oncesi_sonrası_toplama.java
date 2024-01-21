public class fonksiyon_oncesi_sonrası_toplama {
     public static void arttir(int n)
    {
        n++;
        System.out.println("fonksiyon içindeki n: "+n);
    }
    

    public static void main(String[] args) {
        int x=1;
        System.out.println("fonksiyon çağırımından önce x: "+x);
        arttir(x);
        System.out.println("fonksiyon çağırmadan sonra x: "+x);
    }
   
}
