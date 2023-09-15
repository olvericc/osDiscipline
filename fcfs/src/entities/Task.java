package entities;

public class Task
{
    private final int id;
    private final int bT; // burstTime
    private int wT; // waitTime
    private int rT; // responseTime

    public Task(int id, int bT)
    {
        this.id = id;
        this.bT = bT;
        this.wT = 0;
        this.rT = 0;
    }

    public int getId()
    {
        return id;
    }

    public int getbT()
    {
        return bT;
    }

    public int getwT()
    {
        return wT;
    }

    public void setwT(int wT)
    {
        this.wT = wT;
    }

    public int getrT()
    {
        return rT;
    }

    public void setrT(int rT)
    {
        this.rT = rT;
    }
}
