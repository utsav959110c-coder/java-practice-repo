public class FactorialOfANumber {
    public static void main(String[] args){
        //WRite a factorial of a number
         int f=1;
         int n=0;
         if(n==0){
             System.out.println(1);
         }
         for(int i=n; i>=1; i--){
             f=f*i;
             System.out.println(f);
         }

    }
}
