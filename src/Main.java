public class Main {

    public static void main(String[] args) {

        /* 내가 쓴 코드
        Animal animal = new Animal("Animal", "Big", 400);
        Dog dog = new Dog();

        animal.noise();
        animal.move("slow");
        System.out.println(animal.toString());

        System.out.println("- - - - -");

        dog.noise();
        dog.move("fast");
        System.out.println(dog.toString());
        */

        Animal animal = new Animal("Animal","Big", 400);
        doAnimalStuff(animal, "slow");
        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {

        animal.noise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }

}
