public class FInalVariable {
    // final static int a=10;
    /*
     * static for we wnat to assess withot object. if you dont use the static then
     * need to use object
     */
    final int a = 10;// now it is error.. cause it is a consesntce

    public static void main(String[] args) {
        final int x = 10;
        /* you cannot change the value of final variable(It will be constant). */

        // ---> System.out.println("A is Final:"+a);// error
        System.out.println(x);// okay
        // we can only use final in method

    }
}