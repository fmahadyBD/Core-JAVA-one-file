public class CallByReferenceExample {
    public static void main(String[] args) {
        // create an object of the Person class
        Person person = new Person("John", 30);

        // call the changeAge function and pass the person object as a parameter
        changeAge(person);

        // print the updated age of the person object
        System.out.println("Updated age: " + person.getAge());
    }

    public static void changeAge(Person p) {
        // change the age of the Person object passed as a parameter
        p.setAge(40);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
