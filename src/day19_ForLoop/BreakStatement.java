package day19_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {

        for(int i = 0; i<5;i++){
            System.out.println("hello");
            break;
        }

        System.out.println("========================");

        for(char ch = 'A'; ch<='H'; ch++){
            System.out.println(ch+"");
            if(ch=='C'){
                break;
            }

        }

        System.out.println();
        System.out.println("===============================");
 for (int i = 10; i<=50; i+=10){  // i: 10, 20 30 40 50


     System.out.print(i+"");

     if (i == 30){
         break;
     }

 }

        System.out.println();
        System.out.println("===================================");


         for(int x = 1000; x>=100 ; x-=100){

             if(x == 500){
                 break;  // exits the loop
             }
             System.out.print(x+" ");
         }













    }





































}
