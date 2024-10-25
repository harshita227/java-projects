import java.util.Scanner;




public class Main {
    static void main_menu(){
        System.out.println();
        System.out.println("_________ *** Welcome to Pizza Mania ***________");
        System.out.println();
        System.out.println("___________*** Enter Your Choice ***_________");
        System.out.println();
        System.out.println("1) To Add Pizza for DineIn \t\t\t  2) To Add Pizza For TakeAway");
        System.out.println();
        System.out.println("3) Bill generator \t\t\t    \t\t\t 4)To Check Stock   \t\t\t  " );
        System.out.println ("5) Any Query");
        System.out.println();
        System.out.println("________ *** Enter 0 to exit ***________");


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pizza piz=new Pizza();

    int choice=90;
    while(choice!=0) {
        main_menu();
        choice = sc.nextInt();
        while (choice != 0 && choice != 9) {
            if (choice == 1) {
                piz.addPizzaDine();
                piz.billGen();
            } else if (choice == 2) {
                piz.addPizzaDeliv();


            } else if (choice == 3) {
                piz.billGen();

            } else if (choice == 4) {
                piz.checkStock();

            } else if (choice == 5) {
                System.out.println("Appko Hui Pareshani Ke Liye Hume Khed Hai_____");
            } else {
                System.out.println("Enter Valid Choice");
            }
        }
    }


}}