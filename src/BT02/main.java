package BT02;

public class main {
    public static void main(String[] args) {
        Animal animal1 = AnimalFactory.createAnimal("dog");
        animal1.speak();
        Animal animal2 = AnimalFactory.createAnimal("cat");
        animal2.speak();
    }
}
