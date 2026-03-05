public class PrimeCheck {
    public static void main(String[] args){

        //check if a number is prime or not
        int n=131;
        boolean is_prime=true;


        for(int i=2; i<=n/2; i++ ){
            if(n%i==0){
                is_prime=false;
                System.out.println("found one factor");
                break;

            }

        }
       if(is_prime==false){
           System.out.println(n +" is not a prime no.");
       }
       else{
           System.out.println(n +" is a prime no.");
       }

    }
}
