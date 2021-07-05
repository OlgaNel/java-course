package com.company;

import java.util.Scanner;

public class lesson4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Which task do you want?");
        int task = in.nextInt();

        switch (task) {
            case 1:
                task1();
                break;
            case 2:
                task2(args);
                break;
            case 3:
                task3(args);
                break;
            case 4:
                task4();
                break;
            case 5:
                task5(args);
                break;
            case 6:
                task6(args);
                break;
            case 7: printWord("current task" + task);
                break;
            default:
                System.out.println("wrong task");
        }

        //task1(args);
        //task2(args);
        //task3(args);
        //System.out.println(task4());
        //task5(args);
        //task6(args);
    }


    public static void task1() {

        for(int i = 1; i < 10; i++) {
            if ((i % 7) == 0 ){
                System.out.print(i);
                System.out.print(", ");
            }
        }
    }

    public static void task2(String[] args) {

        int i = 0;
        do
        {
            if((i%7) == 0){
                System.out.print(i);
                System.out.print(", ");
                i++;
            }
        } while (i < 100);
    }

    public static void task3(String[] args) {
        int i = 0;

        do{
            System.out.println(i);
            i++;
        } while(i<=10);
    }

    public static boolean task4() {
        int[] array = {1, 2, 3};
        int expected = 13;

        boolean result = false;

        for (int value : array) {
            if (value == expected) {
                result = true;

            }

        }
        System.out.println(result);
        return result;
    };

    public static void task5(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter height");
        int height = in.nextInt();
        System.out.println("Enter width");
        int width = in.nextInt();

        int i = 0;
        while(i < height){
            int j = 1;
            System.out.print(i);
            for(; j <= width; j++){
                System.out.print("#");
               // System.out.println(j);
            }
            System.out.println("");
            i++;
        }
        System.out.println();
    }

    public static void task6(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter password");
        int expectedPassword= 123;
        int numberOfRetries = 2;
        int password = in.nextInt();
        int i = 0;

        if(expectedPassword != password) {
            System.out.println("Incorrect");

            for ( ; i < numberOfRetries; ) {
                while(password != expectedPassword){
                    password = in.nextInt();
                    if(password != expectedPassword) {
                        System.out.println("Incorrect");
                        i++;
                        if(i == numberOfRetries) break;
                    } else {
                        System.out.println("Correct");
                        break;
                    }

                }

            }
            System.out.println("retry");
        }

        if(i > 2) System.out.println("Sorry, you don't have any tries");
    }

    public static void printWord(String word) {
        System.out.println(word);
    }
};


