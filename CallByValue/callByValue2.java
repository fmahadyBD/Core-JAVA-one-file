public class CallByValue2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("Before swap:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        swap(x, y);

        System.out.println("After swap:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
