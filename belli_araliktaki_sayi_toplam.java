public class belli_araliktaki_sayi_toplam {
    
    public static int topla(int baslangic, int bitis){
        int toplam=0;
        for(int i=baslangic; i<=bitis; i++)
        toplam+=i;
        return toplam;
        }
    

   public static void main(String[] args) {
    System.out.println("1-10 arası toplam: " + topla(1,10));
    System.out.println("20-37 arası toplam: " + topla(20,37));


    /* 
    int sum=0;
    for(int i=0; i<=10; i++)
    sum+=i;
    System.out.println("1-10 arası toplam: "+sum);

    sum=0;
    for(int i=20; i<37; i++)
    sum+=i;
    System.out.println("20-37 arası toplam: "+sum);
    */
    //eski yapım
   }
}
