public class Employee extends Bank {
    private String name;
    private boolean working;

    public Employee(String location, boolean open, String name, boolean working)
    {
        super(location, open);
        this.name = name;
        this.working = working;
    }

    public String getName()
    {
        return name;
    }

    public void work()
    {
        System.out.println("I am working!");
        working = true;
    }

    public boolean isWorking()
    {
        return working;
    }
}
