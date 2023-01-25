public class StaticInnerClass {
    public static void main(String[] args) {
        /*
         * you can access it without creating an object of the outer class:
         */
        outer objOuter = new outer();
        // outer.inner objIn=objOuter.new inner();
        // we don't need this cause it is a static inner class

        outer.inner objIn = new outer.inner();
        System.out.println("Outer class:"+objOuter.OX);
        System.out.println("Innerclass is:"+objIn.IX);

    }

}

class outer {
    int OX = 1;

    static class inner {
        int IX = 2;

    }
}
