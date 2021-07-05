package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main.task1(args);
        Main.task2(args);
        Main.task3(args);
        Main.task4(args);
        Main.task5(args);
    }


    public static void task1(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter time");
        int time = in.nextInt();

        if (time > 18) {
            System.out.println("Good evening");
        } else {
            System.out.println("Good day");
        }

//        String result = (time > 18) ? "Good evening" : "Good day";
//        System.out.println(result);
    }

    public static void task2(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter time");
        int time2 = in.nextInt();

        if (time2 > 18) {
            System.out.println("Good evening");
        } else if (time2 < 10) {
            System.out.println("Good morning");
        } else{
            System.out.println("Good day");
        }
    }

    public static void task3(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter week week_number");
        int week_number = in.nextInt();

        switch(week_number) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                    break;
            case 3 :
                System.out.println("Wednesday");
        }
    }

    public static void task4(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter string value");
        String stringValue = in.nextLine();
        int actualValue = stringValue.length();
        System.out.println("Enter expected value");
        int expectedValue = in.nextInt();

        if(actualValue >= expectedValue){
            System.out.println("Error");
        }
        System.out.println("Your string's length is " + actualValue);
    }

    public static void task5(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter login");
        String login = in.nextLine();
        System.out.println("Enter password");
        String password = in.nextLine();

        String existLogin = "Yuriy";
        String existPassword = "pass";

        if (existLogin.equals(login) ){
            if (existPassword.equals(password) ){
                System.out.println("You are logged in!");
            } else {
                System.out.println("Login or password is wrong (password)");
            }
        } else {
            System.out.println("Login or password is wrong (login)");
        }
    }
}
