import java.util.Scanner;

public class Liabrary implements utility{

    String liabraryName;
    String liabraryCollege;
    String liabrarianName;


    @Override
    public void get_details() {
        System.out.println("liabrary name is :"+liabraryName);
        System.out.println("College name is:"+liabraryCollege);
        System.out.println("Liabrarian name is:"+liabrarianName);
    }

    @Override
    public void set_details() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of Your Liabrary");
        liabraryName=sc.nextLine();
        System.out.println("Enter the name of your college ");
        liabraryCollege=sc.nextLine();
        System.out.println("Enter the name of your liabrarian");
        liabrarianName=sc.nextLine();

    }
}
