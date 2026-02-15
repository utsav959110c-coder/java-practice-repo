public class AgeCheck {

    public static void main(String[] args){

        //program to check age
        //if age is >=18:adult , if age>=60 ; senior citizen else minor

        int age=9;

        if(age>=18){

            if (age>=60){

                System.out.println("Senior Citizen");
            }

            else {
                System.out.println("Adult");
            }
        }

        else {

            System.out.println("minor");
        }
    }


}
