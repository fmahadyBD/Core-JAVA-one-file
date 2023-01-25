public class FinalClass {
    public static void main(String[] args) {
        /*
         * Final class can not be extends
         * 
         */
    }

}

class b extends a {// for the final class a , it can not be extends
    void fakeCommitment() {
        System.out.println("I have Already Broken!");

    }
}

final class a {
    void fakelove() {
        System.out.println("I have lost every feelings by it");
    }
}