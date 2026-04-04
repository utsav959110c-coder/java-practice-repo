package Loops;

public class Diamond {;
    public static void main(String[] args) {
         for(int i=1; i<=5; i++){
             for(int j=1; j<=5-i; j++ ){
                 System.out.print(" ");
             }
             for(int k=1; k<=2*(i-1) +1; k++){
                 System.out.print(k);
             }
             System.out.println( );

         }

         for(int m=1; m<=5; m++){
             for(int n=1; n<=m; n++){
                 System.out.print(" ");
             }
             for(int r=1; r<=2*(4-m)+1; r++){

                 System.out.print(r);
             }
             System.out.println();
         }




    }
}
