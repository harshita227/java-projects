import java.util.Scanner;

public class Showroom implements utility{

   String Showroom_name;
   String Showroom_Address;
   int total_Employees;
   int total_cars_inStock=0;
   String Manager_Name;




    @Override
    public void get_details() {
        System.out.println("Name of the Showroom is:"+Showroom_name);
        System.out.println("Address of the Showroom is:"+Showroom_Address);
        System.out.println("Total Numbers of Employees in the Showroom is:"+total_Employees);
        System.out.println("Total Numbers of cars stocks in Showroom is:"+total_cars_inStock);
        System.out.println("Name of the Showroom Manager is:"+Manager_Name);

    }
    @Override
    public void set_details(){
        Scanner sc=new Scanner(System.in);
        System.out.println("__________ *** Enter Showroom Details ***__________");
        System.out.println();
        System.out.println("Enter Name of the Showroom");
        Showroom_name=sc.nextLine();
        System.out.println("Enter the Address of Showroom");
        Showroom_Address=sc.nextLine();
        System.out.println("Enter the Manager Name  of Showroom");
        Manager_Name=sc.nextLine();
        System.out.println("Enter the Total numbers of cars in stock in Showroom");
        total_cars_inStock=sc.nextInt();
        System.out.println("Enter the total numbers of Employees in Showroom");
        total_Employees=sc.nextInt();


    }
}
