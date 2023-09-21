package utils;

import entities.Task;

import java.util.List;

public class Timing
{
    private final List<Task> tasks;
    private int cTime;
    private int totalWaitingTime; 
    private int totalResponseTime;

    public Timing(List<Task> tasks)
    {
        this.tasks = tasks;
        this.cTime = 0;
        this.totalWaitingTime = 0;
        this.totalResponseTime = 0;
    }

    public void run()
    {
        int isCompleted = 0;

        while (isCompleted < tasks.size())
        {
            final Task currentTask = getTask();

            if (currentTask.getrTime() == 0)
            {
                isCompleted++;
                currentTask.setaTime(cTime + 1);
            }

            cTime++;
        }
    }

    public void calc()
    {
        for (Task task : tasks)
        {
            totalWaitingTime += (task.getaTime() - task.getbTime());
            totalResponseTime += task.getaTime();
        }
    }

    private Task getTask()
    {
        int shortest = 0;
        int shortestTime = Integer.MAX_VALUE;

        for (int i = 0; i < tasks.size(); i++)
        {
            Task task = tasks.get(i);

            if (task.getrTime() > 0 && task.getrTime() < shortestTime && cTime >= task.getwTime())
            {
                shortest = i;
                shortestTime = task.getrTime();
            }
        }

        Task currentTask = tasks.get(shortest);

        currentTask.decrementrTime();
        return currentTask;
    }
}
