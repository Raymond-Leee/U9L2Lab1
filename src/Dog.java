public class Dog extends Animal {
    private boolean walked;
    private String breed;

    public Dog(String name, int age, boolean vaccinated, String colour, boolean walked, String breed)
    {
        super(name, age, vaccinated, colour);
        this.breed = breed;
        this.walked = walked;
    }

    public void walk()
    {
        System.out.println("I have been walked!");
        walked = true;
    }

    public void bark()
    {
        System.out.println("woof!");
    }

    public boolean hasBeenWalked()
    {
        return walked;
    }

    public String getBreed()
    {
        return breed;
    }
}
