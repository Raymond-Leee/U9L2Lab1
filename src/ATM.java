public class ATM extends Bank {
    private boolean online;

    public ATM(String location, boolean open, boolean online)
    {
        super(location, open);
        this.online = online;
    }

    public void turnOn()
    {
        System.out.println("Beep boop, systems online");
    }

    public boolean isOnline()
    {
        return online;
    }
}
