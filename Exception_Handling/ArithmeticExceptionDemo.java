import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String as[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();

        try{

            int result = a/b;
            System.out.println("Division : "+result);

        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occures: "+e.getMessage());
        }

        sc.close();
    }
}
