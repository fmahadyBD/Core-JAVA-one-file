public class privateInnerError {
    public static void main(String[] args) {

        outer objOuter = new outer();
        outer.iner objin = objOuter.new iner();
        // it show already error beacuse iner class is private. and it only can use in
        // the class
        System.out.println("Outer:" + objOuter.x);
        System.out.println("Inner:" + objin.y);
        // error and error

    }

}

class outer {
    int x = 1;

    private class iner {
        int y = 2;
    }

}
