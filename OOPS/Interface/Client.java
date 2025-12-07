package Interface;

import java.util.Scanner;

interface Payment{
    public void pay();
}

class UPIPayment implements Payment{
    
    @Override
    public void pay(){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter UPI_ID: ");
        String upiId = sc.nextLine();

        System.out.print("Enter PIN: ");
        int PIN = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        try{

            System.out.println("Processing.....");
            Thread.sleep(2800);
            System.out.println("Rs."+amount+" payment successfully done");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class CardPayment implements Payment{

    @Override
    public void pay(){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Card Number: ");
        int upiId = sc.nextInt();

        System.out.print("Enter Expire Date: ");
        String PIN = sc.nextLine();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        try{

            System.out.println("Processing.....");
            Thread.sleep(2800);
            System.out.println("Rs."+amount+" payment successfully done");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}

public class Client {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);
        UPIPayment upi=new UPIPayment();
        CardPayment card=new CardPayment();

        System.out.println("1.Card Payment\n2.UPI Payment");
        System.out.print("Enter Your Choice : ");
        int choice  = sc.nextInt();

        switch (choice) {
            case 1:
                card.pay();
                break;
            case 2:
                upi.pay();
                break;
            default:
                System.out.println("Wrong Choice!!!");
        }
    }
}
