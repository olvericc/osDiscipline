package entities;

public abstract class Task
{
    protected int id;
    protected int bT; // burst time
    protected int wT; // waiting time
    protected int rT; // response time

    public Task(int id, int bT)
    {
        this.id = id;
        this.bT = bT;
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