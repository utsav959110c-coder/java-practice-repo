public class LeapYear {
    public static void main(String[]  args){

        //program to find , if a given year is a leap year or not
        //a year is a leap year if it is divisible by four unless it is divisible by 100,
        //unless it is also divisible by 400

        int year=2000;
        if(year%4==0){

            if(year%100==0){

                if(year%400==0){

                    System.out.println( year + " is a leap year!");

                }
                else {

                    System.out.println(year + " is not a leap year!");
                }
            }

            else {
                System.out.println(year + " is a leap year!");
            }


        }

        else {

            System.out.println(year + " is mot a leap year!");
        }

    }
}
