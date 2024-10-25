import java.util.Scanner;
import java.util.UUID;

public class Cars extends Showroom implements  utility {
    String car_name;
    String car_color;
    int car_price;

    public void get_details() {
        System.out.println(" Name of the Car is:" + car_name);
        System.out.println(" Color of Car is" + car_color);
        System.out.println(" Price of Car is:" + car_price);


    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("__________ *** Enter Car Details ***__________");
        System.out.println();
        System.out.println("Enter The Name of the Car");
        car_name = sc.nextLine();
        System.out.println("Enter the Color of Car");
        car_color = sc.nextLine();
        System.out.println("Enter the Price of Car");
        car_price = sc.nextInt();
        total_cars_inStock++;


    }
}
