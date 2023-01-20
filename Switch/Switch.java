import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value is:");
        a = sc.nextInt();
        System.out.println("Enter the second valuue is:");
        b = sc.nextInt();
        System.out.println();
        System.out.println("1-> Sum\n2->Minus\n3->Multiplication\n4->Divide\n");
        switch (sc.nextInt()) {
            case 1:

                System.out.println("The Sum is:" + (a + b));

                break;

            case 2:

                System.out.println("The Minus is:" + (a - b));

                break;

            case 3:

                System.out.println("The Multiplication is:" + (a * b));

                break;

            case 4:

                System.out.println("The Divide is:" + (a / b));

                break;

            default:
                break;
        }
        sc.close();

    }

}
