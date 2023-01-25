public class FinalMethod {

    public static void main(String[] args) {
        /*
         * method as final, you cannot override it.
         */
        b objB = new b();
        b.love();// same error for 14 line are final and it can not override  line 20
    }

}

class a {
    final void love() {
        System.out.println("broken!");
    }
}

class b extends a {
    void love() {// error cause it is a child and it can not override . cause of final
        System.out.println("Love you");
    }
}