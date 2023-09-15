package utils;

import entities.Task;

import java.util.List;

public class Timing
{
    public static void timingFCFS (List<Task> tasks)
    {
        int wT = 0;

        for (Task task : tasks)
        {
            task.setwT(wT);
            wT += task.getbT();
            task.setrT((task.getwT() + task.getbT()));
        }
    }
}
