public class ScoreCard {
     //
    public static void main(String[] args) {

        //write a programe to check the grade of a student
        //90-100 : A grade, 80-90: B , 70-80:C ,60-70:D, 60>: E

        String name="rohan";
        int    marks=108;

        if (marks>100){

            System.out.println("invalid");
        }

         else if  (marks>=90){

             System .out.println("Grade A");
         }


          else if (marks>=70) {

              System.out.println("Grade C");

         }
         else if (marks>=80) {

             System.out.println("Grade B");

         }
          else if (marks>=60) {

              System.out.println("Grade D");

         }
          else {

              System.out.println("Grade E");
         }
    }





}
