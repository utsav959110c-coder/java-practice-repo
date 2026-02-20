public class PrintEven {

    public static void main(String[] args){

        //print all the even numbers upto n , n=50 for now...

        int num=10;

        for(int n=0 ; n<=num; n++) {

            if( n%2==0){
                System.out.println(n);
            }
        }

        for(int n=0; n<=num; n=n+2){

            System.out.println(n);
        }
    }
}
