package application;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        int i;
        int n;
        int[] burst_time;
        int[] remaining_time;
        int[] TT;
        int[] WT;
        int total_time = 0;
        int current_time = 0;
        float avg_wait = 0, avg_TT = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Entre o número de processos: ");
        n = s.nextInt();

        burst_time = new int[n];
        remaining_time = new int[n];
        TT = new int[n];
        WT = new int[n];

        System.out.println("\nInforme a duração estimada de cada processo:");
        for (i = 0; i < n; i++) {
            System.out.print("\tP" + (i + 1) + ": ");
            burst_time[i] = s.nextInt();
            remaining_time[i] = burst_time[i];
        }

        int completed = 0;
        while (completed < n) {
            int shortest = -1;
            int shortestTime = Integer.MAX_VALUE;

            for (i = 0; i < n; i++) {
                if (remaining_time[i] > 0 && remaining_time[i] < shortestTime && current_time >= WT[i]) {
                    shortest = i;
                    shortestTime = remaining_time[i];
                }
            }

            if (shortest == -1) {
                current_time++;
                continue;
            }

            remaining_time[shortest]--;

            if (remaining_time[shortest] == 0) {
                completed++;
                TT[shortest] = current_time + 1;
                avg_TT += TT[shortest] - burst_time[shortest];
                avg_wait += TT[shortest] - burst_time[shortest] - WT[shortest];
            }

            current_time++;
        }

        avg_TT /= n;
        avg_wait /= n;

        System.out.println("\n****************************************************************");
        System.out.println("\tProcessos:");
        System.out.println("****************************************************************");
        System.out.println(" Processo\tTempo Estimado\tTempo de Espera\tTempo de Execução");

        for (i = 0; i < n; i++) {
            System.out.println("\tP" + (i + 1) + "\t " + burst_time[i] + "\t\t " + (TT[i] - burst_time[i]) + "\t\t " + TT[i]);
        }

        System.out.println("\n----------------------------------------------------------------");
        System.out.println("\nTempo de Espera Médio : " + avg_wait);
        System.out.println("\nTempo Médio de Saída : " + avg_TT + "\n");
    }
}
