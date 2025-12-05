import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;



public class AddAnotherSentence {
    public static void main(String as[]) throws Exception{

        Scanner sc = new Scanner(System.in);

        FileWriter file = new FileWriter("MyFile.txt");
        BufferedWriter bw = new BufferedWriter(file);
        bw.newLine();

        System.out.print("Write new sentence : ");
        String str = sc.nextLine();

        bw.append(str);
        bw.close();

        System.out.print("\nProcessing.....");
        Thread.sleep(1500);
        
        System.out.println("\n\nFile Saved Successfull");

        sc.close();
    }
}
