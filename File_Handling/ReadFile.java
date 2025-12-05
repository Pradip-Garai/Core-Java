import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
    public static void main(String as[]) throws Exception {

        FileReader fr = new FileReader("MyFile.txt");
        BufferedReader bf = new BufferedReader(fr);
        System.out.println(bf.readLine());
        bf.close();
    }
}
