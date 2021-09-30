package LogicalProblems;

import java.util.Scanner;

public class StopwatchSimulator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 1 to start the clock");

        double start = s.nextDouble();
        if (start == 1)
            start = System.currentTimeMillis();
        else
            System.out.println("Invalid Input");
        System.out.println("Enter 2 to stop the clock");
        double stop = s.nextDouble();
        if (stop == 2)
            stop = System.currentTimeMillis();
        else
            System.out.println("Invalid Input");
        double elapsed_time = (int) (stop - start) / 1000;
        System.out.println("Elapsed time is " + elapsed_time + "seconds");

    }
}
