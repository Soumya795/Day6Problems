package LogicalProblems;

import java.util.Scanner;

public class CouponNumbers {
    public static void main(String[] args) {


        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();
        int arr[] = new int[num];
        int distinct = 1;
        int couponCount = 0;
        while (distinct <= num) {


            int random = (int) (Math.random() * num);
            couponCount++;
            if (arr[random] != random + 1) {
                distinct++;
                arr[random] = random + 1;
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Total coupon is " + couponCount);
    }

}
