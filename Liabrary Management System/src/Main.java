import java.util.Scanner;

interface utility{
    public void get_details();
    public  void set_details();
}


public class Main {
    static void main_menu(){
        System.out.println();
        System.out.println("__________**** Welcome To Liabrary Management System ****__________");
        System.out.println();
        System.out.println("___________*** Enter Your Choice ***___________");
        System.out.println();
        System.out.println("1) To Add Liabrary  \t\t\t 2) To Add Student \t\t\t 3) To Add Book");
        System.out.println();
        System.out.println("4) To Get Liabrary  \t\t\t 5) To Get Student \t\t\t 6) To Get Books");
        System.out.println();
        System.out.println("___________*** Enter 0 To Exit ***__________");


    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Liabrary liabrary[]=new Liabrary[5];
        StudentDe student[]=new StudentDe[5];
        Book book[]=new Book[5];
         int book_counter=0;
         int student_counter=0;
         int liabrary_counter=0;
         int choice =100;
         while(choice!=0){
             main_menu();
             choice=sc.nextInt();
             while(choice!=9 && choice!=0){
                 switch (choice){
                     case 1:
                         liabrary [liabrary_counter]=new Liabrary();
                         liabrary[liabrary_counter].set_details();
                         liabrary_counter++;
                         System.out.println("_____*** Liabrary Added successfully *** _____");

                         System.out.println();
                         System.out.println("1)To Add New Liabrary");
                         System.out.println("9)Go Back to Main Menu");
                         choice=sc.nextInt();
                         break;
                     case 2:
                         student[student_counter]=new StudentDe();
                         student[student_counter]. set_details();
                         student_counter++;
                         System.out.println("_____*** Student Added successfully *** _____");
                         System.out.println();
                         System.out.println("1)To Add New Student");
                         System.out.println("9)Go Back to Main Menu");
                         choice=sc.nextInt();
                         break;
                     case 3:
                         book [book_counter]=new Book();
                         book[book_counter].set_details();
                         book_counter++;
                         System.out.println("_____*** Book Added successfully *** _____");

                         System.out.println();
                         System.out.println("1)To Add New Book");
                         System.out.println("9)Go Back to Main Menu");
                         choice=sc.nextInt();
                         break;
                     case 4:
                         for(int i=0;i<liabrary_counter;i++){
                             liabrary[i].get_details();
                             System.out.println();
                             System.out.println();
                         }
                         System.out.println();
                         System.out.println("9) Go Back To Main Menu");
                         System.out.println("0) Exit");
                         choice=sc.nextInt();
                         break;
                     case 5:
                         for(int i=0;i<student_counter;i++){
                             student[i].get_details();
                             System.out.println();
                             System.out.println();
                         }
                         System.out.println();
                         System.out.println("9) Go Back To Main Menu");
                         System.out.println("0) Exit");
                         choice=sc.nextInt();
                         break;
                     case 6:
                         for(int i=0;i<book_counter;i++){
                             book[i].get_details();
                             System.out.println();
                             System.out.println();
                         }
                         System.out.println();
                         System.out.println("9) Go Back To Main Menu");
                         System.out.println("0) Exit");
                         choice=sc.nextInt();
                         break;
                     default:
                         System.out.println("Enter Valid Choice");
                         break;


                 }
             }
         }




    }
    }
