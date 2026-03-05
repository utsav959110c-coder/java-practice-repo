public class LibrayMembership {
    public static void main(String[] args) {
        //Write a Java program to assign a library membership based on age. If the age is less than 12, print
        //"Child Member". If the age is 12 or more, then check if the age is 18 or less and print "Student
        //Member". Otherwise, print "Adult Member"

        int a = 15;
        if (a >= 12) {
            if (a > 18) {
                System.out.println("Adult Member");
            } else {
                System.out.println("Student Member");
            }
        } else {
            System.out.println("Child Member");
        }
    }
}







