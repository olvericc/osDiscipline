package application;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        int[] burst_time, process, waiting_time, tat;

        int i, j, n, pos, temp;

        float wait_avg,TAT_avg;

        int total = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("Entre o número de processos: ");

        n = s.nextInt();

        process = new int[n];
        burst_time = new int[n];
        waiting_time = new int[n];
        tat = new int[n];

        System.out.println("\nInforme o tempo de execução estimado:");

        for(i = 0; i < n; i++)
        {
            System.out.print("P[" + (i + 1) + "]: ");
            burst_time[i] = s.nextInt();
            //Process Number
            process[i]= i + 1;
        }

        //Sorting
        for(i=0;i<n;i++)
        {
            pos = i;
            for(j = i + 1; j < n; j++)
            {
                if(burst_time[j] < burst_time[pos])
                {
                    pos = j;
                }
            }

            temp = burst_time[i];
            burst_time[i] = burst_time[pos];
            burst_time[pos] = temp;
            temp = process[i];
            process[i] = process[pos];
            process[pos] = temp;
        }

        //First process has 0 waiting time
        waiting_time[0] = 0;

        //Calculate waiting time
        for(i = 1; i < n; i++)
        {
            waiting_time[i] = 0;
            for(j = 0; j < i; j++)
            {
                waiting_time[i] += burst_time[j];
                total += waiting_time[i];
            }
        }

        //Calculating Average waiting time
        wait_avg = (float) total / n;
        total = 0;

        System.out.println("\nPROC.\tTempo Execução\tTempo de Espera\tTempo de Saída");

        for(i = 0; i < n; i++)
        {
            //Calculating Turnaround Time
            tat[i] = burst_time[i] + waiting_time[i];
            total += tat[i];

            System.out.println("P" + process[i] + "\t\t " + burst_time[i] + "\t\t " + waiting_time[i] + "\t\t " + tat[i]);
        }

        //Calculation of Average Turnaround Time
        TAT_avg = (float) total / n;

        System.out.println("\n\nTempo de Espera Médio: " + wait_avg);
        System.out.println("Tempo Médio de Saída: " + TAT_avg);
    }
}
