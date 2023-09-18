package utils;

import entities.Task;

import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.List;

import static utils.Alignment.alignRight;

public class Timing
{
    public static void timing (List<Task> tasks)
    {
        int number = tasks.size();

        tasks.sort(Comparator.comparingInt(Task::getbT));

        int totalWaitingTime = 0;

        tasks.get(0).setwT(0);

        for (int i = 1; i < number; i++)
        {
            int wT = 0;

            for (int j = 0; j < i; j++)
            {
                wT += tasks.get(j).getbT();
                totalWaitingTime += wT;
            }
        }
        
        int totalResponseTime = 0;
        
        for (Task task : tasks)
        {
            int rT = task.getbT() + task.getwT();
            task.setrT(rT);
            totalResponseTime += rT;
        }

        double avgWaitingTime = (double) totalWaitingTime / number;
        double avgResponseTime = (double) totalResponseTime / number;

        Printer.printL("\nTask\tExecution Time\tWaiting Time\tDeparture Time");

        int COLUMN_WIDTH = 15;

        for (Task task : tasks)
        {

            String id = String.format("%d", task.getId());
            String bT = String.format("%d", task.getbT());
            String wT = String.format("%d", task.getwT());
            String rT = String.format("%d", task.getrT());

            id = alignRight(id, COLUMN_WIDTH);
            bT = alignRight(bT, COLUMN_WIDTH);
            wT = alignRight(wT, COLUMN_WIDTH);
            rT = alignRight(rT, COLUMN_WIDTH);

            Printer.printL(id + bT + wT + rT);

            avgWaitingTime += task.getwT();
            avgResponseTime += task.getrT();
        }

        DecimalFormat decimalFormat = new DecimalFormat("#,##");

        String formattedAvgWaitingTime = decimalFormat.format(avgWaitingTime);
        String formattedAvgResponseTime = decimalFormat.format(avgResponseTime);

        Printer.printL("\nAverage waiting time: " + formattedAvgWaitingTime);
        Printer.printL("\nAverage departure time: " + formattedAvgResponseTime);
    }
}
