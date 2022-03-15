public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private String colour;

    public Animal (String name, int age, boolean vaccinated, String colour)
    {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.colour = colour;
    }

    public void adopt()
    {
        System.out.println("I have been adopted!");
    }

    public void feed()
    {
        System.out.println("I have been fed!");
    }

    public void wash()
    {
        System.out.println("I have been washed!");
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public boolean isVaccinated()
    {
        return vaccinated;
    }

    public String getColour() {
        return colour;
    }
}
