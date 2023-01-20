import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the max  value system");
        System.out.println("Enter the 1st Value:\n");
        a = sc.nextInt();
        System.out.println("Enter the 2nd Value:\n");
        b = sc.nextInt();
        System.out.println("Enter the 3rd Value:\n");
        c = sc.nextInt();
        int retult = MaxCheecker(a, b, c);
        System.out.println("The MAx value is: " + retult);
        sc.close();

    }

    public static int MaxCheecker(int a, int b, int c) {

        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }

    }
}