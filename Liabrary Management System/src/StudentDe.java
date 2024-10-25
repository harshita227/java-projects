import java.util.Scanner;

public class StudentDe extends  Liabrary implements utility{
    String studentName;
    String studentClass;
    int studentphone;
    String studentEmail;


    @Override
    public void get_details() {
        System.out.println("Student name is :"+studentName);
        System.out.println();
        System.out.println("Class is:"+studentClass);
        System.out.println("Student  email is:"+studentEmail);
        System.out.println("Student  Phone number is:"+studentphone);
    }

    @Override
    public void set_details() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of Your Student ");
        studentName=sc.nextLine();
        System.out.println("Enter the name of your class ");
        studentClass=sc.nextLine();
        System.out.println("Enter the email of your Student ");
        studentEmail=sc.nextLine();
        System.out.println("Enter the Phone no. of your Student ");
        studentphone=Integer.parseInt(sc.nextLine());

    }

}
