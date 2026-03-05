public class BankDetails {
    public static void main(String[] args) {

        int b = 10;
        if(b>=0){
            if(b>=10000){
                System.out.println("premium account");
            }
            else{
                System.out.println("regular account");
            }
        }
        else {
            System.out.println("account inactive");
        }

    }

}
