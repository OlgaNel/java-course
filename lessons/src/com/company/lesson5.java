package com.company;

import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args) {
        task1(args);
        task2(args);
    }

    public static boolean task1(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Add number");
        int number = in.nextInt();

        //boolean result = number % 2 == 0;
        System.out.println(number % 2 == 0);
        return number % 2 == 0;
    }

    public static int task2(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many items do you want?");
        int numberOfItems = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= numberOfItems; i++) {
            System.out.println("Provide the " + i);
            int item = in.nextInt();
            sum = sum + item;
        }
        System.out.println("The sum of your items is " + sum);

        return sum;

    }

}
