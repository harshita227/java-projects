import java.util.Scanner;

class AtmMac {
int pin=1230;
float Balance;
Scanner sc=new Scanner(System.in);
   public void checkPin(){
    System.out.println("Entered Your Pin*****");
    int enteredPin=sc.nextInt();
    if(enteredPin==pin){
        menu();
    }else{
        System.out.println("Please Write Correct pin ");
    }
}




public void  menu() {
    System.out.println("Enter Your Choice");
        System.out.println("Press 1 Check A/c Balance");
    System.out.println("Press 2 Withdraw Money");
    System.out.println("Press 3 Deposite Money");
    System.out.println("Press 4 to Exit");
    int opt=sc.nextInt();
    if(opt==1){
        checkBalance();
    }else if(opt==2){
        withdrawMoney();
    }else if(opt==3){
        depositeMoney();
    }else if(opt==4){
      return;
    }else{
        System.out.println("Invalid option");
    }
}

    public void checkBalance(){
   System.out.println("Check Balance"+Balance);     
   menu();
    }
    public void withdrawMoney(){
  System.out.println("Enter Amount You want to withdraw");
  float Amount= sc.nextFloat();
  if(Amount>Balance){
    System.out.println("Insufficient balance");
  }else{
    Balance=Balance-Amount;
    System.out.println("Money withdrawL Successfull.......");
  }
  menu();
    }

    public void depositeMoney(){
        System.out.println("Enter the Amount you want to deposite");
        Float Amount=sc.nextFloat();
        Balance=Balance+Amount;
            System.out.println("Money Deposited Successfull.......");
menu();

    }


}


   public class Atm{
    public static void main(String[] args) {
     AtmMac at=new AtmMac();
     at.checkPin();   
    }
    
}

