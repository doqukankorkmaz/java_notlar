public class dizilerde_kopyalama {
    public static void main(String[] args) {
       /*  int a=5;
        int b;
        b=a;
        a=7;
        System.out.println(b);*/

        /* 
        int[]dizi1={3,5,7};
        int[]dizi2={0,1,2};
        System.out.println();
        dizi2=dizi1;
        dizi1[1]=18;
        System.out.println(dizi2[0]);
        System.out.println(dizi2[1]);
        System.out.println(dizi2[2]);
        */


        /* 
        int[]dizi1={3,5,7};
        int[]dizi2={0,1,2};

        for(int i=0; i<dizi2.length; i++){
            dizi2[i]=dizi1[i];
        }
        System.out.println(dizi2[0]);
        System.out.println(dizi2[1]);
        System.out.println(dizi2[2]);
        */

        
        /* 
        int[]kaynak={23,43,55};
        int[]hedef=new int[3];
        //hedef=kaynak;
        System.arraycopy(kaynak,0,hedef,0,3);
        kaynak[1]=71;
        System.out.println(hedef[1]);//43, hedef=kaynak; olursa 71 cevabı çıkar
        */
        
        /* 
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
        }
       
        public static void printMax(double... numbers) {
        if (numbers.length == 0) {
        System.out.println("No argument passed");
        return;
        }
       
        double result = numbers[0];
       
        for (int i = 1; i < numbers.length; i++)
        if (numbers[i] > result)
        result = numbers[i];
       
        System.out.println("The max value is " + result);

    */

    /* 
        int number=0;
        int[]numbers=new int[1];
        m(number,numbers);
        System.out.println("Numbers is "+number+" and numbers[0] is "+numbers[0]);

    }
    public static void m(int x,int[] y) {
        x=3;
        y[0]=3;
        */

        
    }
}
