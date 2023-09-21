package application;

import entities.Task;
import utils.Alignment;
import utils.Printer;
import utils.Timing;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static utils.Printer.printL;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Printer.print("Enter the number of tasks: ");
        Printer.print("");
        int numberOfTasks = sc.nextInt();

        List<Task> tasks = new ArrayList<>();

        for (int i = 0; i < numberOfTasks; i++)
        {
            Printer.print("Enter the estimated duration of task T" + (i + 1) + ": ");
            int burstTime = sc.nextInt();
            tasks.add(new Task(i + 1, burstTime));
        }

        Timing timing = new Timing(tasks);
        timing.run();
        timing.calc();
        Printer.showTable();

        int totalWaitTime = 0;
        int totalAnswerTime = 0;

        for (Task task : tasks)
        {
            String taskId = "T" + task.getId();
            String burstTime = String.valueOf(task.getbTime());
            String waitTime = String.valueOf(task.getaTime() - task.getbTime());
            String departureTime = String.valueOf(task.getaTime());

            taskId = Alignment.alignRight(taskId, 8);
            burstTime = Alignment.alignRight(burstTime, 15);
            waitTime = Alignment.alignRight(waitTime, 12);
            departureTime = Alignment.alignRight(departureTime, 15);

            printL(taskId + burstTime + waitTime + departureTime);

            totalWaitTime += (task.getaTime() - task.getbTime());
            totalAnswerTime += (task.getaTime());
        }

        double avgWaitingTime = (double) totalWaitTime / numberOfTasks;
        double avgResponseTime = (double) totalAnswerTime / numberOfTasks;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        String formattedAvgWaitingTime = decimalFormat.format(avgWaitingTime);
        String formattedAvgResponseTime = decimalFormat.format(avgResponseTime);

        Printer.printL("\n----------------------------------------------------------------");
        Printer.printL("\nAverage waiting time: " + formattedAvgWaitingTime);
        Printer.printL("\nAverage departure time: " + formattedAvgResponseTime);

        sc.close();
    }
}