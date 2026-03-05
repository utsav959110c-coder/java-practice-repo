public class SumOfSquaresTillN {

    public static void main(String[] args){

        //sum of squares till n

          int sum=0;
          for( int n=2; n<=10; n=n+2){
              sum=sum+n*n;

              System.out.println(sum);
          }

    }
}
