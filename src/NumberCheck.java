public class NumberCheck {

    public static void main(String[] args){

        //if no. >0 , then check the given no. is even or odd , else print ; no. is 0 or negative

        int no=0;
        if(no>0){

            if(no%2==0){

                System.out.println( no+" is even");
            }
            else {
                System.out.println( no + " is odd");
            }


        }

        else{

            System.out.println( no + "is zero or negative");
        }
    }


}
