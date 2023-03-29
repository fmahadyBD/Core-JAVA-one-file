public class Override {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
