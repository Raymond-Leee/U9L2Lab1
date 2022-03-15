public class Cat extends Animal {
    private boolean played;
    private boolean hair;

    public Cat(String name, int age, boolean vaccinated, String colour, boolean played, boolean hair)
    {
        super(name, age, vaccinated, colour);
        this.played = played;
        this.hair = hair;
    }

    public void play()
    {
        System.out.println("I have been played with!");
        played = true;
    }

    public void meow()
    {
        System.out.println("meow!");
    }

    public boolean hasPlayedWith()
    {
        return played;
    }

    public boolean hasHair()
    {
        return hair;
    }
}
