import java.util.Scanner;

public class kart_bulma {
    public static void main(String[] args) {
        int [] deck =new int[52];
        String[] suits={"Karo","sinek","kupa","maça"};
        String[] ranks={"ace","2","3","4","5","6","7","8","9","10","joker","kız","papaz"};

        for(int i=0; i<deck.length; i++){
            deck[i]=i;
        }
        for(int i=0; i<deck.length; i++){
            int index=(int)(Math.random()*deck.length);
            int temp=deck[i];
            deck[i]=deck[index];
            deck[index]=temp;
        
        }

        for(int i=0; i<4; i++){
         String suit=suits[deck[i]/13];
         String rank=ranks[deck[i]/13];
         System.out.println("cart numuber "+deck[i]+": "+rank+" of "+suit);
        }



    }
}
