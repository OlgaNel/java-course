package HomeWork3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Which task do you want?");
        int task = in.nextInt();
        switch (task) {
            case 1:
                task1(args);
                break;
            case 2:
                task2(args);
                break;
            case 3:
                task3(args);
                break;
            case 4:
                task4(args);
                break;
            case 5:
                task5(args);
                break;
            case 6:
                task6(args);
                break;
            default:
                System.out.println("Wrong task.");
        }

    }

    public static void task1(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }

    public static void task2(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void task3(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void task4(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    public static void task5(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter height");
        int height = in.nextInt();
        System.out.println("Enter width");
        int width = in.nextInt();

        int i = 0;
        while (i < height) {
            int j = 1;
            for (; j <= width; j++) {
                System.out.print("#");
            }
            System.out.println("");
            i++;
        }
        System.out.println();
    }

    public static void task6(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter password");
        int expectedPassword = 123;
        int numberOfRetries = 2;
        int password = in.nextInt();
        int i = 0;

        while ((password != expectedPassword) && (i != numberOfRetries)) {
            System.out.println("Incorrect.");
            password = in.nextInt();
            i++;
        }
        if ((password == expectedPassword) && (i <= numberOfRetries)) {
            System.out.println("Correct.");
        } else {
            System.out.println("Lock.");
        }
    }


}
