package LogicalProblems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter How Many Terms ");
        int n = s.nextInt();

        long f1 = 0;
        long f2 = 1;
        long f = f1 + f2;
        int count = 3;
        while (count < n) {
            f1 = f2;
            f2 = f;
            f = f1 + f2;
            count++;
        }
        System.out.println(f);
    }
}