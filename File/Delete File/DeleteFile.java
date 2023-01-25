import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        try {
            File file = new File("File.txt");
            if (file.delete()) {
                System.out.println(file.getName() + "is deleted!");
            } else {
                System.out.println("File are not found");
            }
        } catch (Exception e) {
            System.out.println("The exceptions are: " + e);
        }
    }

}
