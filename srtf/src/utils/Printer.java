package utils;

public class Printer
{

    public static void print(String args)
    {
        System.out.print(args);
    }

    public static void printL(String args)
    {
        System.out.println(args);
    }

    public static void showTable()
    {
        printL("\n****************************************************************");
        printL("\tTasks:");
        printL("******************************************************************");
        printL(" Task\tEstimated Time\t Wait Time\tExecution Time");
    }
}
