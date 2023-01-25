import java.io.*;

public class fileCreate {
    public static void main(String[] args) {
        try {
            File file = new File("File.txt");
            /*
             * To create a file in a specific directory (requires permission), specify the
             * path of the file and use
             * double backslashes to escape the "\" character (for Windows).
             */
            // File file = new File("C:\\Users\\MyName\\filename.txt");
            if (file.createNewFile()) {
                System.out.print("Created");
                // System.out.println("File created: " + file.getName());
             
            } else {
                System.out.println("Already exit");
            }

        } catch (Exception e) {
            System.out.println(e);

        }
    }

}
