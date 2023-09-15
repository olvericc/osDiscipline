package utils;

public class Printer {
    public static void print (String args)
    {
        System.out.print(args);
    }
    public static void printL (String args)
    {
        System.out.println(args);
    }

    public static void taskTable()
    {
        System.out.println("\n**************************************************************************");
        System.out.println("\ttasks:");
        System.out.println("**************************************************************************");
        System.out.println("\t        task\t    estimated time\t    waiting time\t    runtime");
    }

}
