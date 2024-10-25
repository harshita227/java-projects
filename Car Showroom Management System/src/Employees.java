import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements  utility {
    String Emp_Id;
    String Emp_Name;
    int Emp_Age;
    String Emp_Department;

    @Override
    public void get_details() {
        System.out.println(" Id of the Employee is:"+Emp_Id);
        System.out.println(" Name of the Employee is:"+Emp_Name);
        System.out.println(" Age of Employee is"+Emp_Age);
        System.out.println(" Department of Employees is:"+Emp_Department);
        System.out.println("   Name  of Showroom is:"+Showroom_name);


    }

    @Override
    public void set_details() {
        Scanner sc=new Scanner(System.in);
        UUID uuid= UUID.randomUUID();
        Emp_Id=String.valueOf(uuid);
        System.out.println("__________ *** Enter Employee Details ***__________");
        System.out.println();
        System.out.println("Enter Name of the Employee");
        Emp_Name=sc.nextLine();
        System.out.println("Enter the Age of Employee");
        Emp_Age=sc.nextInt();
        System.out.println("Enter the  Name  of Showroom");
        Showroom_name=sc.nextLine();
        System.out.println("Enter the Department of Employees ");
        Emp_Department=sc.nextLine();

    }
}
