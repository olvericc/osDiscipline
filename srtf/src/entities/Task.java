package entities;

public class Task
{
    private final int id;
    private final int bTime; // burst time
    private int rTime; // remaining time
    private int aTime; // answer time
    private final int wTime; // waiting time

    public Task(int id, int bTime)
    {
        this.id = id;
        this.bTime = bTime;
        this.rTime = bTime;
        this.aTime = 0;
        this.wTime = 0;
    }

    public int getId()
    {
        return id;
    }

    public int getbTime()
    {
        return bTime;
    }

    public int getrTime()
    {
        return rTime;
    }

    public void decrementrTime()
    {
        if (rTime > 0)
        {
            rTime--;
        }
    }

    public void setaTime(int time)
    {
        aTime = time;
    }

    public int getaTime()
    {
        return aTime;
    }

    public int getwTime()
    {
        return wTime;
    }
}
