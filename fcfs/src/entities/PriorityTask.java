package entities;

public class PriorityTask extends Task
{
    private int priority;

    public PriorityTask(int id, int bT, int priority)
    {
        super(id, bT);
        this.priority = priority;
    }

    public int getPriority()
    {
        return priority;
    }
}
