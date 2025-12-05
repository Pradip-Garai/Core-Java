import java.io.File;

public class CreateFile {
    public static void main(String as[]) throws Exception {
        File file = new File("MyFile.txt");
        file.createNewFile();
        System.out.println(file.exists());
    }
}
