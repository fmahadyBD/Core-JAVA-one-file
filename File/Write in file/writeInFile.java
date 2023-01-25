import java.io.FileWriter;

public class writeInFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("File.txt");
            // if file is not belong in the directory. then create first.
            writer.write("Hi writing in file");
            writer.close();
            System.out.println("Write successfully");
        } catch (Exception e) {
            System.out.println("The exception:" + e);
        }
    }

}
