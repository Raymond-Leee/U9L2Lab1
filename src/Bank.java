public class Bank {
    private String location;
    private boolean open;

    public Bank(String location, boolean open)
    {
        this.location = location;
        this.open = open;
    }

    public String getLocation()
    {
        return location;
    }

    public void open()
    {
        System.out.println("The bank is open!");
        open = true;
    }

    public boolean isOpen()
    {
        return open;
    }
}
