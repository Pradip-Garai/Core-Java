package OOPS.Abstraction;

abstract class Payment{
    abstract public void makePayment();
}

//UPI Payment
class UPI_Payment extends Payment{

    private String upiId;
    private int PIN,amount;

    public UPI_Payment(String upiId,int PIN,int amount){
        this.PIN=PIN;
        this.upiId=upiId;
        this.amount=amount;
    }

    @Override
    public void makePayment(){
         
        try{
            System.out.println("Search Account...");
            Thread.sleep(2000);
            System.out.println("Rs "+amount+" Payment Done");
        }catch(Exception e){
          System.out.println(e.getMessage());
        }
        

    }
}


// Card payment
class Card_Payment extends Payment{
    private int cardNo,amount;
    private String expiredate;

    public Card_Payment(String expirdate,int cardNo,int amount){
        this.expiredate=expirdate;
        this.cardNo=cardNo;
        this.amount=amount;
    }

    @Override 
    public void makePayment(){
         try{
            System.out.println("Search Account...");
            Thread.sleep(2000);
            System.out.println("Payment Done");
            System.out.println("Rs "+amount+" Payment Done");
        }catch(Exception e){
          System.out.println(e.getMessage());
        }
    }
}

public class Client {
    public static void main(String as[]){
        UPI_Payment pay = new UPI_Payment("abc@ybl",12456,12000);
        pay.makePayment();
    }
}
