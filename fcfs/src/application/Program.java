package application;

import entities.PriorityTask;
import entities.Task;
import utils.Printer;
import utils.Timing;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static utils.Alignment.alignRight;

public class Program
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Printer.print("enter the number of tasks: ");
        int nTasks = sc.nextInt();

        List<Task> tasks = new ArrayList<>();

        Printer.printL("\n enter the estimated duration of each task:");

        for (int i = 0; i < nTasks; i++)
        {
            Printer.print("\ttask " + (i + 1) + ": ");
            int bT = sc.nextInt();

            tasks.add(new Task(i + 1, bT));
        }

        int pTaskId = nTasks + 1;

        Printer.print("\ttask " + pTaskId + ": ");
        int pBurstTime = sc.nextInt();

        tasks.add(new PriorityTask(pTaskId, pBurstTime, 3));

        Timing.timingFCFS(tasks);

        Printer.taskTable();

        double avgWaitTime = 0, avgResponseTime = 0;
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

            avgWaitTime += task.getwT();
            avgResponseTime += task.getrT();
        }

        avgWaitTime /= nTasks + 1;
        avgResponseTime /= nTasks + 1;

        avgWaitTime /= nTasks;
        avgResponseTime /= nTasks;

        DecimalFormat decimalFormat = new DecimalFormat("#,##");

        String formattedAvgWaitTime = decimalFormat.format(avgWaitTime);
        String formattedAvgResponseTime = decimalFormat.format(avgResponseTime);

        Printer.printL("\n--------------------------------------------------------------------------");
        Printer.printL("\naverage wait time : " + formattedAvgWaitTime);
        Printer.printL("\naverage departure time : " + formattedAvgResponseTime);

        sc.close();
    }
}
