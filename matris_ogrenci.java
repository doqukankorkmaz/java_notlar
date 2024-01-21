public class matris_ogrenci {
    public static void main(String[] args) {
       
        char[][] cevaplar={{'A','B','A','C','C','D','E','E','A','D'},
                           {'D','B','A','B','C','A','E','E','A','D'},
                           {'E','D','D','A','C','B','E','E','A','D'},
                           {'C','B','A','E','D','C','E','E','A','D'}};

        char[]dogrucevaplar={'D','B','A','E','D','C','E','E','A','D'};

        int dogrucevapsayisi =0;

    for(int i=0; i<cevaplar.length; i++) {
      for(int j=0; j<dogrucevaplar.length; j++) {
        if(cevaplar[i][j] == dogrucevaplar[j]) {
          dogrucevapsayisi++;
        }
      }
      System.out.println((i+1) + ". öğrenci doğru cevap sayısı " + dogrucevapsayisi);
      dogrucevapsayisi=0;
        }
    }
}
