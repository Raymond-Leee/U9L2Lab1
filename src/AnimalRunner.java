public class AnimalRunner {
    public static void main(String[] args) {
        // Animal Class
        System.out.println("Animal Class Test");
        Animal animal = new Animal("Animal", 100, true, "White");
        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + animal.getAge());
        System.out.println("Vaccinated: " + animal.isVaccinated());
        System.out.println("Colour: " + animal.getColour());
        animal.adopt();
        animal.feed();
        animal.wash();

        // Dog Class
        System.out.println("\nDog Class Test");
        Dog dog = new Dog("Malenia, Blade of Miquella", 13, false, "Brown", false, "Poodle");
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Vaccinated: " + dog.isVaccinated());
        System.out.println("Colour: " + dog.getColour());
        System.out.println("Walked: " + dog.hasBeenWalked());
        System.out.println("Breed: " + dog.getBreed());
        dog.adopt();
        dog.feed();
        dog.wash();
        dog.walk();
        dog.bark();
        System.out.println("Walked: " + dog.hasBeenWalked());

        // Cat Class
        System.out.println("\nCat Class Test");
        Cat cat = new Cat("Dog", 5, false, "Gray", false, true);
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Vaccinated: " + cat.isVaccinated());
        System.out.println("Colour: " + cat.getColour());
        System.out.println("Played: " + cat.hasPlayedWith());
        System.out.println("Hair: " + cat.hasHair());
        cat.adopt();
        cat.feed();
        cat.wash();
        cat.play();
        cat.meow();
        System.out.println("Played: " + cat.hasPlayedWith());
    }
}
