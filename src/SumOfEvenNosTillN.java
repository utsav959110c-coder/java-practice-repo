public class SumOfEvenNosTillN {
    public static void main(String[] args){

        //sum of even nos till n

        int sum=0;
        for (int n=1; n<=10; n++){
            if(n%2==0){
                sum=sum+n;
                System.out.println(sum);
            }
        }
    }
}
