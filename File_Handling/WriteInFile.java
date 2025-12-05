import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteInFile {
    public static void main(String as[])throws Exception {

        Scanner sc = new Scanner(System.in);

        FileWriter fw = new FileWriter("MyFile.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        System.out.print("Write anything in file : ");
        String str = sc.nextLine();

        bw.write(str);
        bw.close();
        System.out.println("\n\nFile Save Successfull!!!\n");

        sc.close();
    }
}
