import java.io.*;

public class fileCreate {
    public static void main(String[] args) {
        try {
            File file = new File("File.txt");
            if (file.createNewFile()) {
                System.out.print("Created");
            } else {
                System.out.println("Already exit");
            }

        } catch (Exception e) {
            System.out.println(e);

        }
    }

}
