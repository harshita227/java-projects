import java.util.Scanner;

public class Book extends Liabrary implements  utility {
    String bookName;
    String bookAuthor;
    int bookPrice=723;
    int bookValidity=14;



    @Override
    public void get_details() {
        System.out.println("Book name is :"+bookName);
        System.out.println("Book Author is:"+bookAuthor);
        System.out.println("Book Price  is:"+bookPrice);
        System.out.println("Book return after"+bookValidity+" Days");
    }

    @Override
    public void set_details() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of Your Book to issued");
        bookName=sc.nextLine();
        System.out.println("Enter the name of your Book  Author ");
        bookAuthor=sc.nextLine();

    }

}
