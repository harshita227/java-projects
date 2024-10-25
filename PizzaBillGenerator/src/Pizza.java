import java.util.Scanner;

public class Pizza {
   int Pizza=12;
  int del=20;
  int pVeg=300;
  int price=0;
  int pNveg=500;
  Scanner sc=new Scanner(System.in);
  public void  addPizzaDine() {
    System.out.println("Enter the pizza you want to select for DineIN");
    System.out.println();
    System.out.println("\t\t\t 6)for Veg 7) for NonVeg");
    int pizza = sc.nextInt();
    while (pizza != 0) {
      if (pizza == 6) {
        price = price + pVeg;
        System.out.println("Veg Pizza Price Is:" + price);
        break;


      } else {
        price = price + pNveg;
      }
    }
  }

  public void checkStock() {
    System.out.println("AVailable Pizza is:  "+Pizza);
    Main.main_menu();

  }

  public void billGen() {
    System.out.println("Your Total bill is:"+ price);
    System.out.println("_____****Thank YOu for SHopping With us ***____");
  }

  public void addPizzaDeliv() {
    while (Pizza!=0){

    System.out.println("Enter the pizza you want to select for Delivery");
    System.out.println();
    System.out.println("\t\t\t 7)for Veg 8) for NonVeg");
    int pizza= sc.nextInt();
    if(pizza==7){
      price=price+pVeg+del;

    }else {
      price=price+pNveg+del;
    }

  }
}}
