package application;

import entities.ConcreteTask;
import entities.Task;
import utils.Printer;
import utils.Timing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        Printer.print("Enter the number of tasks: ");
        int numberOfTasks = sc.nextInt();

        List<Task> tasks = new ArrayList<>();

        Printer.printL("\nEnter the estimated execution time:");

        for (int i = 0; i < numberOfTasks; i++)
        {
            Printer.print("T[" + (i + 1) + "]: ");
            int bT = sc.nextInt();
            tasks.add(new ConcreteTask(i + 1, bT));
        }

        Timing.timing(tasks);
    }
}